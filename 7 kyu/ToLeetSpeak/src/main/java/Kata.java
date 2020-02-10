/*Your task is to write a function toLeetSpeak that converts a regular english sentence to Leetspeak.

More about LeetSpeak You can read at wiki -> https://en.wikipedia.org/wiki/Leet

Consider only uppercase letters (no lowercase letters, no numbers) and spaces.

For example:

toLeetSpeak("LEET") returns "1337"
In this kata we use a simple LeetSpeak dialect. Use this alphabet:

{
  A : '@',
  B : '8',
  C : '(',
  D : 'D',
  E : '3',
  F : 'F',
  G : '6',
  H : '#',
  I : '!',
  J : 'J',
  K : 'K',
  L : '1',
  M : 'M',
  N : 'N',
  O : '0',
  P : 'P',
  Q : 'Q',
  R : 'R',
  S : '$',
  T : '7',
  U : 'U',
  V : 'V',
  W : 'W',
  X : 'X',
  Y : 'Y',
  Z : '2'
}

https://www.codewars.com/kata/57c1ab3949324c321600013f/train/java*/

class Kata {
    static String toLeetSpeak(final String speak) {

        String s = "";
        String[] str =  speak.toUpperCase().split("");
        System.out.println(speak);
        for (int i = 0; i < str.length; i++) {

            switch (str[i]){
                case " " : s+= " "; continue;
                case "A" : s+="@";continue;
                case "B" : s+="8";continue;
                case "C" : s+="(";continue;
                case "D" : s+="D";continue;
                case "E" : s+="3";continue;
                case "F" : s+="F";continue;
                case "G" : s+="6";continue;
                case "H" : s+="#";continue;
                case "I" : s+="!";continue;
                case "J" : s+="J";continue;
                case "K" : s+="K";continue;
                case "L" : s+="1";continue;
                case "M" : s+="M";continue;
                case "N" : s+="N";continue;
                case "O" : s+="0";continue;
                case "P" : s+="P";continue;
                case "Q" : s+="Q";continue;
                case "R" : s+="R";continue;
                case "S" : s+="$";continue;
                case "T" : s+="7";continue;
                case "U" : s+="U";continue;
                case "V" : s+="V";continue;
                case "W" : s+="W";continue;
                case "X" : s+="X";continue;
                case "Y" : s+="Y";continue;
                case "Z" : s+="2";
                default: s+=str[i];
        }}
        return s;
    }
}