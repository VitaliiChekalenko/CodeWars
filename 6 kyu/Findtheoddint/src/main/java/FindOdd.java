/*Given an array, find the int that appears an odd number of times.

There will always be only one integer that appears an odd number of times.*/



public class FindOdd {
	public static int findIt(int[] a) {
	    int temp = 0;
	    for(int j = 0 ; j<a.length; j++){

	        for (int s: a){
	             if(a[j]==s) temp++;
        }
	        if (temp%2 != 0) return a[j];

	        temp = 0;
	    }

        return 1;
  }
}