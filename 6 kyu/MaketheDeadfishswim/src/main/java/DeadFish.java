/*Write a simple parser that will parse and run Deadfish.

Deadfish has 4 commands, each 1 character long:

i increments the value (initially 0)
d decrements the value
s squares the value
o outputs the value into the return array
Invalid characters should be ignored.

Deadfish.parse("iiisdoso") =- new int[] {8, 64};

https://www.codewars.com/kata/51e0007c1f9378fa810002a9/train/java*/

import java.util.ArrayList;
import java.util.List;

public class DeadFish {
    public static int[] parse(String data) {
        String[] d = data.split("");
        List<Integer> doneList = new ArrayList<Integer>();
        int num = 0;


        for (String s : d) {
            switch (s) {
                case ("i"):
                    num++;
                    continue;
                case ("d"):
                    num--;
                    continue;
                case ("s"):
                    num = num * num;
                    continue;
                case ("o"):
                    doneList.add(num);
            }
        }
        int[] done = new int[doneList.size()];
        for (int i = 0; i < done.length; i++) {
            done[i] = doneList.get(i);
        }
        return done;
    }
}
