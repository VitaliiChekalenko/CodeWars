//You are given two arrays a1 and a2 of strings. Each string is composed with letters from a to z. Let x be any string in the first array and y be any string in the second array.
//
//        Find max(abs(length(x) − length(y)))
//
//        If a1 and/or a2 are empty return -1 in each language except in Haskell (F#) where you will return Nothing (None).
//
//        #Example:
//
//        a1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
//        a2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
//        mxdiflg(a1, a2) --> 13
//        Bash note:
//        input : 2 strings with substrings separated by ,
//        output: number as a string


import java.util.Arrays;

class MaxDiffLength {

    public static int mxdiflg(String[] a1, String[] a2) {

        sou
        int tempBig1= a1[0].length(), tempBig2=a2[0].length();
        int tempSma1= a1[0].length(), tempSma2=a2[0].length();
        int[] s = new int[4];

        for (int i = 0; i < a1.length ; i++) {
            if(tempBig1<=a1[i].length()){
                s[0]= a1[i].length();
            }
            if(tempSma1>=a1[i].length()){
                s[1]= a1[i].length();
            }
        }
        for (int i = 0; i < a2.length ; i++) {
            if(tempBig2<=a2[i].length()){
                s[2]= a2[i].length();
            }
            if(tempSma2>=a2[i].length()){
                s[3]= a2[i].length();
            }
        }
        Arrays.sort(s);



             return s[3]-s[0];
    }}