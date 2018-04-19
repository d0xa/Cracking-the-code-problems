public class chapter1Problem4
{
  public static void main(String[] args)
  {
    /*Given a string, write a function to check if it is a permutation of a palindrome.
     A palindrome is a word or phrase that is the same forwards and backwards. A permutation
     is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.*/
  String s = "tacocat";
  System.out.println("Is " + s + " a palidrome? "+palidrome(s));
  }
  public static boolean palidrome(String s){
    int[] words = new int[128]; //assuming its ascii
    for(int i =0;i<s.length();i++)
    {
      int j = (int) s.charAt(i);
      System.out.println(j);
      words[j]++;
    }
   // print(words);
    for(int i=0;i<s.length();i++)
    {
      int j = (int) s.charAt(i);
      if(words[j]>1)
      words[j]--;
      
    }
    //print(words);
    for(int i=0;i<words.length;i++)
    {
      
      if(words[i] != 0){
        System.out.print(words[i]);
        return false;
      }
    }
  return true;
  }
  public static void print(int[] a){
    for(int i=0;i<a.length;i++)
  System.out.print(a[i]+",");
    System.out.println();
}
}
