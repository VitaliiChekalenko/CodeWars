/*Given a positive number n > 1 find the prime factor decomposition of n. The result will be a string with the following form :

 "(p1**n1)(p2**n2)...(pk**nk)"
with the p(i) in increasing order and n(i) empty if n(i) is 1.

Example: n = 86240 should return "(2**5)(5)(7**2)(11)"

https://www.codewars.com/kata/54d512e62a5e54c96200019e/train/java

*/

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class PrimeDecomp {
   
    public static String factors(int n) {
        System.out.println(n);

        List<Integer> s = new ArrayList<Integer>();
        int[] nums = new int[]{2, 3, 5, 7, 11};
        int i = 0;
        String done = "(";

        try{
        while(n!=0){
            if(n%nums[i]==0){
                n=n/nums[i];
                s.add(nums[i]);
            }else{
                i++;
            }}}catch (IndexOutOfBoundsException e){
            s.add(n);
        }

        int[] q = new int[5];

        for (int j = 0; j <  nums.length; j++) {
            int count = 0;
            for (int l = 0; l <s.size(); l++) {
                if(nums[j]==s.get(l)){
                    count++;
                }
            }
            q[j] = count;
        }

        Set<Integer> duppl = new LinkedHashSet<Integer>(s);
        List<Integer> du = new ArrayList<Integer>(duppl);

        for (int j = 0; j <q.length ; j++) {
            if(q[j]==1){
                done+= du.get(j)+")(";
                continue;
            }
            done+= du.get(j)+"**"+q[j]+")(";
        }
    return done+s.get(s.size()-1)+")";}

}