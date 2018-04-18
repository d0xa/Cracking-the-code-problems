public class Chapter1Problem1
{
  public static void main(String[] args)
  {
   // Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
   //cannot use additional data structures?
   String s = "Help Wow";
   System.out.println(isUnique(s));
  }
  
  public static boolean isUnique(String s){
  char[] wordArray = s.toCharArray(); //first we convert the string into a char array
  
    if(wordArray.length ==0) // if the array is empty it means, that there is no elements, which means nothing repeats so its true
    return true;
    
    for(int i =0;i<wordArray.length;i++){
      for(int j=i+1;j<wordArray.length;j++)
        if(wordArray[i]==wordArray[j]) //we go through the array chosing one char and comparing it to the rest of the array
             return false;
    }
  return true; //if it passes the previous case it means that it is completely unique so it passes the test.
  }
}