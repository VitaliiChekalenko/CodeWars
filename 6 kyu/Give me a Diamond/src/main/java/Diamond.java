/*Jamie is a programmer, and James' girlfriend. She likes diamonds, and wants a diamond string from James. Since James doesn't know how to make this happen, he needs your help.

Task
You need to return a string that looks like a diamond shape when printed on the screen, using asterisk (*) characters. Trailing spaces should be removed, and every line must be terminated with a newline character (\n).

Return null/nil/None/... if the input is an even number or negative, as it is not possible to print a diamond of even or negative size.

Examples
A size 3 diamond:

 *
***
 *
...which would appear as a string of " *\n***\n *\n"

A size 5 diamond:

  *
 ***
*****
 ***
  *
...that is: " *\n ***\n*****\n ***\n *\n"


https://www.codewars.com/kata/5503013e34137eeeaa001648/train/java

*/

import java.util.Collections;

class Diamond {
    public static String print(int n) {
<<<<<<< HEAD
        if ((n<1 || n%2!=1) )return null;
        String s = " ";


        for (int i = 1; i < n; i += 2) {
          s+= String.join("", Collections.nCopies(i,"*" ))+"\n";
        }
    return s;
    }

=======
        if(n<=0 || n%2==0) return null;
        String s = "";

        for (int i = 1; i <= n; i += 2) {
          s+= new String(new char[(n-i)/2]).replace("\0", " ") ;
            s+= new String(new char[i]).replace("\0", "*") + "\n";
        }
        for (int i = n-2; i >0; i -= 2) {
            s+= new String(new char[(n-i)/2]).replace("\0", " ") ;
            s+= new String(new char[i]).replace("\0", "*") + "\n";
        }

    return s;}
>>>>>>> 011eb2f06445e33d42b9fa406c259831d2517375
}