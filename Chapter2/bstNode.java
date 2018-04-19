public class bstNode{ 
   public int item;
   public bstNode left;
 public bstNode right;
   
   public bstNode(int i){
     item = i;
     left = null;
     right = null;
   }
 
   public bstNode(int i, bstNode l, bstNode r){
     item = i;
     left = l;
     right = r;
   }
    public static bstNode insert(bstNode T, int i){
    if (T==null)
      T = new bstNode(i);
    else
      if (i<T.item)
      T.left = insert(T.left,i);
    else 
      T.right = insert(T.right,i);
    return T;
  }
    public static bstNode search(bstNode T, int i){
    if (T==null || T.item== i)
      return T;
    if (i<T.item)
      return search(T.left,i);
    else
      return search (T.right,i);
  }
  
  public static boolean iterativeSearch (bstNode T, int x){
    bstNode temp = T;
    while(temp != null) {
      if(x < temp.item)
        temp = temp.left;
      else if(x > temp.item)
        temp = temp.right;
      else // X was found 
        return true;
    }
    return false;
  }
  
  public static bstNode sortedBstBuild(int[] a, int start, int length) {
    bstNode  Y = null;
    if(start > length)
      return Y;
    
    int middle = (start+length+1)/2; //gets the middle of the array for the new root of the BST
    bstNode T = new bstNode(a[middle]); //sets the new root to the middle of the sorted array
    T.left = sortedBstBuild(a, start, middle - 1); // makes sure that the left side is smaller than the root
    T.right = sortedBstBuild(a, middle + 1, length); // makes sure that the right side is bigger than the root
    
    return T; //returns the sorted BST
  }
  
  
  
  public static bstNode min(bstNode T){
    if (T.left ==null)
      return T;
    return min(T.left);
  }
  
  public static int height (bstNode T){
    if (T==null)
      return -1;
    int hl = height(T.left);
    int hr = height(T.right);
    if(hl>hr)
      return 1+hl;
    return 1+hr;
  }
  
  public static bstNode delete(bstNode T, int i){
    if (T == null)
      return null;
    if (i<T.item)
      T.left=delete(T.left,i);
    else
      if (i>T.item)
      T.right=delete(T.right,i);
    else
      // i == T.item
      if (T.left == null && T.right == null)
      T =  null;
    else
      if (T.left == null && T.right != null)
      T = T.right;
    else
      if (T.left != null && T.right == null)
      T = T.left;
    else{
      bstNode succ = min(T.right);
      T.item = succ.item;
      T.right = delete(T.right, succ.item);
    }
    return T;
  }
  
  
  
  public static void draw_tree(bstNode T, double x0, double x1, double y, double y_inc) {
    if(T ==null)
      return;
    double xm = (x0+x1)/2;
    double yn = y-y_inc;
    if(T.left!=null){
      StdDraw.line(xm,y,(x0+xm)/2,yn);
      draw_tree(T.left,x0,xm,yn, y_inc);
    }
    if (T.right!=null){
      StdDraw.line(xm,y,(x1+xm)/2,yn);
      draw_tree(T.right,xm,x1,yn, y_inc);
    }   
    StdDraw.setPenColor(StdDraw.WHITE);
    StdDraw.filledCircle(xm,y, 3);
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.circle(xm,y, 3);
    StdDraw.text(xm,y,Integer.toString(T.item));
  }
}
