//Complete the solution so that it reverses all of the words within the string passed in.
//
//        Example:
//
//        ReverseWords.reverseWords("The greatest victory is that which requires no battle");
//// should return "battle no requires which that is victory greatest The"

public class ReverseWords{

 public static String reverseWords(String str){
     String[] arr= str.split(" ");
     String out="";
     for(int i=arr.length-1; i>=0; i--){
         out+= arr[i]+" ";
     }
     return out.trim();
 }
}