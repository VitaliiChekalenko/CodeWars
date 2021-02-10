//Complete the solution so that the function will break up camel casing, using a space between words.
//
//Example
//solution("camelCasing")  ==  "camel Casing"


//import java.util.Arrays;
//
//class Solution {
//  public static String camelCase(String input) {
//    return input.replaceAll("([A-Z])", " $1");
//  }
//}


class Solution {
  public static String camelCase(String input) {

    if(input.isEmpty()) return "";

    String[] temp = input.split("");
    for (int i = 0; i < temp.length; i++) {
      if(temp[i].toUpperCase().equals(temp[i])){
        temp[i] = " "+temp[i];
        }
    }

    return String.join("", temp);
  }

}