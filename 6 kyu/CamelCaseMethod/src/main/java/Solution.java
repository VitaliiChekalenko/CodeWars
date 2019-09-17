//Write simple .camelCase method (camel_case function in PHP, CamelCase in C# or camelCase in Java) for strings. All words must have their first letter capitalized without spaces.
//
//        For instance:
//
//        camelCase("hello case"); // => "HelloCase"
//        camelCase("camel case word"); // => "CamelCaseWord"
//        Don't forget to rate this kata! Thanks :)


public class Solution {

    public static String camelCase(String str) {

        if(str.trim().length()==0) return "";
        if(str.contains("  ")) str = str.replaceAll("  ", " ");
        if(str.trim().length()==1) return str.trim().toUpperCase();


        String[] done = str.trim().split(" ");
        String vov="";

        for (String s: done      ) {
          //  vov += s.substring(0,1).toUpperCase()+s.substring(1);
            if(s.length()>0){
            vov += (s.charAt(0)+"").toUpperCase()+s.substring(1);
        }}
    return vov;
    }
}
