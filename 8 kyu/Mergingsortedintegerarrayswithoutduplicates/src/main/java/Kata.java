/*Write a function that merges two sorted arrays into a single one.
 The arrays only contain integers. Also, the final outcome must be sorted and not have any duplicate.*/

import java.util.TreeSet;

public class Kata {
	public static int[] mergeArrays(int[] first, int[] second) {
		TreeSet<Integer> temp = new TreeSet<Integer>();
		for (int i : first){
			temp.add(i);
		}
		for (int i : second){
			temp.add(i);
		}
		int[] done = new int[temp.size()];
		int co = 0;
		for(int a : temp){
			done[co] = a;
			co++;
		}
		return done ;
	}
}