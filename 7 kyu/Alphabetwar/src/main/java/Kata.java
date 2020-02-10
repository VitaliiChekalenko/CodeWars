/*Introduction
There is a war and nobody knows - the alphabet war!
There are two groups of hostile letters. The tension between left side letters and right side letters was too high and the war began.

Task
Write a function that accepts fight string consists of only small letters and return who wins the fight. When the left side wins return Left side wins!, when the right side wins return Right side wins!, in other case return Let's fight again!.

The left side letters and their power:

 w - 4
 p - 3
 b - 2
 s - 1
The right side letters and their power:

 m - 4
 q - 3
 d - 2
 z - 1
The other letters don't have power and are only victims.

Example
AlphabetWar("z");        //=> Right side wins!
AlphabetWar("zdqmwpbs"); //=> Let's fight again!
AlphabetWar("zzzzs");    //=> Right side wins!
AlphabetWar("wwwwwwz");  //=> Left side wins!
Alphabet war Collection

https://www.codewars.com/kata/59377c53e66267c8f6000027/train/java
*/

public class Kata {
    public static String alphabetWar(String fight) {
        int win = 0;

        for (int i = 0; i < fight.length(); i++) {
            switch (fight.charAt(i)){
                case 'w':win+= 4; continue;
                case 'p':win+= 3; continue;
                case 'b':win+= 2; continue;
                case 's':win+= 1; continue;
                case 'm':win-= 4 ; continue;
                case 'q':win-= 3 ; continue;
                case 'd':win-= 2 ; continue;
                case 'z':win-= 1 ;

            }
        }

        return win<0? "Right side wins!" : win>0? "Left side wins!":"Let's fight again!";
    }
}