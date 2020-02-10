
/*I will give you an integer. Give me back a shape that is as long and wide as the integer. The integer will be a whole number between 0 and 50.

Example
n = 3, so I expect a 3x3 square back just like below as a string:

+++
+++
+++

https://www.codewars.com/kata/59a96d71dbe3b06c0200009c/train/java

*/
public class Kata {
    public static final String generateShape(int n) {
        String s="";

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                s+="+";
            }
            s+="\n";
        }

        return s.trim();
    }
}
