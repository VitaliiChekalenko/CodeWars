/*Definition
Balanced number is the number that * The sum of all digits to the left of the middle digit(s) and the sum of all digits to the right of the middle digit(s) are equal*.

Task
Given a number, Find if it is Balanced or not .

Warm-up (Highly recommended)
Playing With Numbers Series
Notes
If the number has an odd number of digits then there is only one middle digit, e.g. 92645 has middle digit 6; otherwise, there are two middle digits , e.g. 1301 has middle digits 3 and 0

The middle digit(s) should not be considered when determining whether a number is balanced or not, e.g 413023 is a balanced number because the left sum and right sum are both 5.

Number passed is always Positive .

Return the result as String

Input >> Output Examples
(balanced-num 7) ==> return "Balanced"
Explanation:
Since , The sum of all digits to the left of the middle digit (0)

and the sum of all digits to the right of the middle digit (0) are equal , then It's Balanced

(balanced-num 295591) ==> return "Not Balanced"
Explanation:
Since , The sum of all digits to the left of the middle digits (11)

and the sum of all digits to the right of the middle digits (10) are Not equal , then It's Not Balanced

Note : The middle digit(s) are 55 .

(balanced-num 959) ==> return "Balanced"
Explanation:
Since , The sum of all digits to the left of the middle digits (9)

and the sum of all digits to the right of the middle digits (9) are equal , then It's Balanced

Note : The middle digit is 5 .

(balanced-num 27102983) ==> return "Not Balanced"
Explanation:
Since , The sum of all digits to the left of the middle digits (10)

and the sum of all digits to the right of the middle digits (20) are Not equal , then It's Not Balanced

Note : The middle digit(s) are 02 .

Playing with Numbers Series
Playing With Lists/Arrays Series
For More Enjoyable Katas
ALL translations are welcomed
Enjoy Learning !!
Zizou

https://www.codewars.com/kata/5a4e3782880385ba68000018/train/java

*/

public class Solution {
    public static String balancedNum(long number) {

        String s = ""+ number;
        int left = 0;
        int rigth = 0;
        if(s.length()<=2) return "Balanced";


        if (s.length()%2==0){
             String sleft = s.substring(0, s.length()/2);
             String srigth = s.substring(s.length()/2);
            for (int i = 0; i < sleft.length(); i++) {
                left+= Integer.parseInt(""+sleft.charAt(i));
                rigth+= Integer.parseInt(""+ srigth.charAt(i));
            }
            left= left - sleft.charAt(sleft.length()-1);
            rigth= rigth - srigth.charAt(0);
        }else {
            String sleft = s.substring(0, (s.length()-1)/2);
            String srigth = s.substring((s.length()+1)/2);
            for (int i = 0; i < sleft.length(); i++) {
                left+= Integer.parseInt(""+sleft.charAt(i));
                rigth+= Integer.parseInt(""+ srigth.charAt(i));
            }
            if(s.length()>3){
            left= left - Integer.parseInt(sleft.charAt(sleft.length()-1)+"");
            rigth= rigth - Integer.parseInt(srigth.charAt(0)+"");
        }
        }
        return left==rigth? "Balanced": "Not Balanced";
    }
}