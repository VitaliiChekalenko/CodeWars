//This time no story, no theory. The examples below show you how to write function accum:
//
//    Examples:
//
//    accum("abcd") -> "A-Bb-Ccc-Dddd"
//    accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//    accum("cwAt") -> "C-Ww-Aaa-Tttt"


import java.util.Collections;

public class Accumul {
    
    public static String accum(String s) {
        String[] str = s.split("");
        String done = "";

        for (int i = 1; i<str.length; i++) {
                done+= str[i].toUpperCase()+ String.join("", Collections.nCopies(i,str[i].toLowerCase()))+ "-";
        }

    return str[0]+"-"+done.substring(0, done.length()-1);


    }
}