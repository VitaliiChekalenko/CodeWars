/*In this kata, you must create a function powers/Powers that takes an array, and returns the number of subsets possible to create from that list. In other words, counts the power sets.

For instance

powers([1,2,3]) => 8
...due to...

powers([1,2,3]) =>
[[],
[1],
[2],
[3],
[1,2],
[2,3],
[1,3],
[1,2,3]]
Your function should be able to count sets up to the size of 500, so watch out; pretty big numbers occur there!

For comparison, my Haskell solution can compute the number of sets for an array of length 90 000 in less than a second, so be quick!

You should treat each array passed as a set of unique values for this kata.

###Examples:

Powers.powers(new int[]{});        // 1
Powers.powers(new int[]{1});       // 2
Powers.powers(new int[]{1,2});     // 4
Powers.powers(new int[]{1,2,3,4}); // 16*/

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Powers {
    public static BigInteger powers(int[] list) {

      return
//        if (list.length == 0) return BigInteger.valueOf(1);
//        if (list.length == 1) return BigInteger.valueOf(2);
//
//        List<Integer> n = new ArrayList<Integer>();
//        for (int i = 0; i < list.length; i++) {
//            if (n.contains(list[i])) {
//                continue;
//            }
//            n.add(list[i]);
//        }
//        int[] a = new int[n.size()];
//      for (int i = 0; i <n.size() ; i++) {
//        a[i] = n.get(i);
//      }
//        return BigInteger.valueOf(1 + a.length  + 1);
    }
}


/*import java.math.BigInteger;

public class Powers {
  public static BigInteger powers(int[] list) {
    return BigInteger.valueOf((long) Math.pow(2,list.length ));
  }
}*/