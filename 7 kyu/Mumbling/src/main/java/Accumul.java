/*This time no story, no theory. The examples below show you how to write function accum:

Examples:

accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.*/

public class Accumul {
    
    public static String accum(String s) {
     String[] arr= s.split("");
     String res="";
        for(int i =0; i<arr.length; i++){
            res+=arr[i].toUpperCase();
     for(int j =1; i<arr.length; j++){
         res+= arr[i].toLowerCase();
     }
     res+="-";
    }
    return res;}
}