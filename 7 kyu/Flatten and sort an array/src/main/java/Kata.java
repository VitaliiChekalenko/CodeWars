/*Challenge:

Given a two-dimensional array of integers, return the flattened version of the array with all the integers in the sorted (ascending) order.

Example:

Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kata {

	public static int[] flattenAndSort(int[][] array) {


		List<Integer> n = new ArrayList<Integer>();


		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				n.add(array[i][j]);
			}
		Collections.sort(n);
		}
		int[] s = new int[n.size()];
		for (int i = 0; i <n.size() ; i++) {
			s[i] = n.get(i);
		}

		return s.length==0? new int[]{}: s;
	}

}
