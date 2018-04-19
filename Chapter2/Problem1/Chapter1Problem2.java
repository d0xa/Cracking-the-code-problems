public class Chapter1Problem2
{
  public static void main(String[] args)
  {
    //Given two strings, write a method to decide if one is a permutation of the
    //other.
    //Permutation means: two words with the same character counts
    String one = "wow";
    String two = "oww";
    System.out.println("Is this a permutation "+checkPermutation(one,two));
  }
  public static boolean checkPermutation(String one, String two){
    if(one.length() != two.length())
      return false; 
    char[] y = two.toCharArray(); //converting one strings to char arrays to more easily transverse the array
    
    int[] ascii = new int[128]; //making a new set counting all character ascii (assuming its in assi code)
    
    for(int i=0;i<one.length();i++){
      int j= (int) one.charAt(i); //we get the int value of the char charater(a value from 0-128)
      ascii[j]++;
    }
    
    for (int i= 0; i < y.length; i++) {
      int j = (int) two.charAt(i);
      ascii[j]--;
      if (ascii[j] < 0) {
        return false;
      }
    }
    return true;
  }
  
}
