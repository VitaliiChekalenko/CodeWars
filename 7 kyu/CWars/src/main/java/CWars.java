/*Normally we have firstname, middle and the last name but there may be more than one word in a name like a South Indian one.

Similar to those kinda names we need to initialize the names.

See the pattern below

initials('code wars') => returns C.Wars
initials('Barack Hussain obama') => returns B.H.Obama
Complete the function initials.

https://www.codewars.com/kata/55968ab32cf633c3f8000008/train/java*/

import java.lang.*;

class CWars {

    public static String initials(String name){ 

        String[] s = name.split(" ");
        String done = "";
        for (int i = 0; i < s.length-1; i++) {
            done += (s[i].charAt(0)+"").toUpperCase()+".";
        }
        done += (s[s.length-1].charAt(0)+"").toUpperCase()+s[s.length-1].substring(1);
        return done;
    }
}