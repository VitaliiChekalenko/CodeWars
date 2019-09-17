//Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
//
//        Examples
//        "This is an example!" ==> "sihT si na !elpmaxe"
//        "double  spaces"      ==> "elbuod  secaps"

public class Kata
{
  public static String reverseWords(final String original)  {
    String res = "";
    if(original.trim().length() > 0) {
      String[] str = original.split(" ");
      for (int i = 0; i < str.length; i++) {
        str[i] = new StringBuffer(str[i]).reverse().toString();
        res+= str[i]+" ";
      }
      return res.trim();
    }
    return original;
  }}