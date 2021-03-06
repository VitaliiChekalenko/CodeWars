/*Remove Duplicates
You are to write a function called unique that takes an array of integers and returns the array with duplicates removed. It must return the values in the same order as first seen in the given array. Thus no sorting should be done, if 52 appears before 10 in the given array then it should also be that 52 appears before 10 in the returned array.

Assumptions
All values given are integers (they can be positive or negative).
You are given an array but it may be empty.
They array may have duplicates or it may not.
You cannot use the uniq method on Arrays (don't even try it), or the nub function from Data.List.
Example
UniqueArray.unique([1, 5, 2, 0, 2, -3, 1, 10])
// -> [1, 5, 2, 0, -3, 10]
What We Are Testing
We are testing basic array usage and knowledge. There are many ways to solve this and advanced users may find faster ways to solve this.*/

import java.util.*;

public class UniqueArray {
    public static int[] unique(int[] integers) {

        if(integers.length==0) return new int[]{};

        List<Integer> n = new ArrayList<Integer>();
        n.add(integers[0]);

        for (Integer r : integers) {
            if(n.contains(r)){
                continue;
            }
            n.add(r);
        }

        int[] s = new int[n.size()];
        for (int i = 0; i <n.size() ; i++) {

            s[i] = n.get(i);

        }
        return s;
    }
}