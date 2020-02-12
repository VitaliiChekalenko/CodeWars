/*Given a number, Find if it is Disarium or not .

Warm-up (Highly recommended)
Playing With Numbers Series
Notes
Number passed is always Positive .
Return the result as String
Input >> Output Examples
disariumNumber(89) ==> return "Disarium !!"
Explanation:
Since , 81 + 92 = 89 , thus output is "Disarium !!"
disariumNumber(564) ==> return "Not !!"
Explanation:
Since , 51 + 62 + 43 = 105 != 564 , thus output is "Not !!"

Playing with Numbers Series
Playing With Lists/Arrays Series
For More Enjoyable Katas
ALL translations are welcomed
Enjoy Learning !!
Zizou

https://www.codewars.com/kata/5a53a17bfd56cb9c14000003/train/java

*/

public class Solution {
    public static String disariumNumber(int number) {

        int n = 0;
        String[] s = (number+"").split("");


        for (int i = 0; i <s.length ; i++) {
            n+= Math.pow(Integer.parseInt(s[i]), i+1);
        }

        return n==number? "Disarium !!": "Not !!";
    }
}