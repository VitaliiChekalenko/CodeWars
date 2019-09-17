/*Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

Examples input/output:

XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false*/

public class XO {
  public static boolean getXO (String str) {
    if(str==null || str=="") return false;
    int os=0, xs=0;
    String[] arr= str.split("");
    for(int i=0; i<arr.length; i++){
      if(arr[i].equals("o")|| arr[i].equals("O")) os++;
      if(arr[i].equals("x")|| arr[i].equals("X")) xs++;
    }
    return os==xs;
  }
}