public class chapter1Problem6
{
  public static void main(String[] args)
  {
    /*Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).*/
    String s = "arrrrrg";
    compress(s);
  }
  public static void compress(String s){
    String newString = "";
    int count=0;
    
    for(int i =0;i<s.length();i++){
      count++;
      if(i+1>=s.length() ||s.charAt(i) != s.charAt(i+1)){ //we check if i+1 does not go out of bounds in the array, and the new words don't equal eachother
        //System.out.println(s.charAt(i));
        newString += s.charAt(i);
        newString+=count; 
        count=0;
      }
    }
    System.out.println(newString); 
  }
}
