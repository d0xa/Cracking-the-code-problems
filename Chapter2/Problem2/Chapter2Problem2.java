public class Chapter2Problem2
{
  public static void main(String[] args)
  {
    int[] a = {1,2,3,4,5,6};
    
    Node root = new Node(a[0]);
    
    for(int i =1;i<a.length;i++){
      root.insert(root,a[i]);
      //System.out.print(root.next.data);
    }
    int k = 0;
    System.out.println(k +" is the " +kth2last(k,root)+" to last");
  }
    public static int kth2last(int k,Node n)
    {
      if (n== null) {
        return 0;
      }
      int index = kth2last(k,n.next) + 1;
      if (index == k) {
        System.out.println(k + "th to last node is " + n.data);
      }
      return index;
    }
  }
