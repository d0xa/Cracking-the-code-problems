public class Chapter1Problem3 //URLify
{
  public static void main(String[] args)
  {
    /*
     *Write a method to replace all spaces in a string with '%20'. You may assume that the string
     has sufficient space at the end to hold the additional characters, and that you are given the "true"
     length of the string. (Note: If implementing in Java, please use a character array so that you can
     perform this operation in place.)
     */
    String s = "This is a test";
    System.out.println(URLify(s));
  }
  public static String URLify(String s){
    char[] wordArray = s.toCharArray();
    StringBuilder cool = new StringBuilder(s);
    
    for(int i =0;i<wordArray.length;i++){
      System.out.println("This is the current index " +i);
      if(wordArray[i] == ' '){
        /*
        System.out.println("This is where the space is" +i);
        cool.replace(i,i,"%20");
        System.out.println(cool.toString());
        //cool.insert(i+1,"20");
//cool.deleteCharAt(i);
        //cool.insert(i,"%20");
        */
        cool.delete(i,i);
        //i--;
        cool.insert(i,"%20");
        i++;  
      }
    }
    return cool.toString();
  }
}
