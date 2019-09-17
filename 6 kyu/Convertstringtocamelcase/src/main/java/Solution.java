//Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).
//
//        Examples
//        toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"
//
//        toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"

import java.lang.StringBuilder;
import java.util.ArrayList;

class Solution{

  static String toCamelCase(String s){
        if(s.equals("")) return "";
    String[] arr = new ArrayList<String>().toArray(new String[0]);
    if (s.contains("-")) arr = s.split("-");
    if (s.contains("_")) arr = s.split("_");
      String done = arr[0];
      for(int i = 1; i<arr.length; i++) {
          arr[i] = arr[i].toUpperCase().charAt(0)+ arr[i].substring(1).toLowerCase();
          done+= arr[i];
      }

    return done;
  }
}