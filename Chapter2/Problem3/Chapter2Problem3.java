public class Chapter2Problem3
{
  public static void main(String[] args)
  {
    int[] a = {1,2,3,4,5,6};
    
    Node root = new Node(a[0]);
    for(int i =1;i<a.length;i++){
      root.insert(root,a[i]);
      //System.out.print(root.next.data);
    }
    deleteMiddle(root);
    for(int i =1;i<a.length;i++){
      //root.insert(root,a[i]);
      System.out.print(root.next.data);
    }
  }
  public static Node deleteMiddle(Node n){
    Node tmp = n;
    if(tmp==null)
      return tmp;
    if(tmp.next.next!=null &&tmp.next.next.next==null)
      tmp.next = tmp.next.next;
    else
      tmp=tmp.next;
    return tmp;
  }
  
}