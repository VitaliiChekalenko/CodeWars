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


class MaxDiffLength {

    public static int mxdiflg(String[] a1, String[] a2) {
        int temp1= a1[0].length(), temp2=a2[0].length();

        for (int i = 1; i <a1.length ; i++) {
            if(a1[i-1].length()<a1[i].length()){
                temp1 = a1[i].length();
            }
            for (int j = 1; j <a2.length ; j++) {
            if(a2[j-1].length()<a2[j].length()){
                temp2 = a2[j].length();
            }
        }

    }
             return temp1-temp2;
    }}