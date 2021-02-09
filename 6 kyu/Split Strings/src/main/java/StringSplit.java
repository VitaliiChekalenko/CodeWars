//Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').
//
//Examples:
//
//StringSplit.solution("abc") // should return {"ab", "c_"}
//StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}

//public class StringSplit {
//    public static String[] solution(String s) {
//        s = (s.length() % 2 == 0)?s:s+"_";
//        return s.split("(?<=\\G.{2})");
//    }
//}

import java.util.ArrayList;

public class StringSplit {
    public static String[] solution(String s) {
        if(s.isEmpty()) return new String[0];

        String[] temp = s.split("");
        ArrayList<String> out = new ArrayList<>();

        for (int i = 0; i < temp.length; i=i+2) {
            try{
                out.add(temp[i]+ temp[i+1]);

            }catch (Exception e){
                out.add(temp[temp.length-1]+"_");
            }
        }


        return out.toArray(new String[0]);
    }
}