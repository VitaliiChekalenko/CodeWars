/*Complete the function to find the count of the most frequent item of an array. You can assume that input is an array of integers. For an empty array return 0

Example
input array: [3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3]
ouptut: 5
The most frequent number in the array is -1 and it occurs 5 times.

https://www.codewars.com/kata/56582133c932d8239900002e/train/java
*/


public class Kata {
  public static int mostFrequentItemCount(int[] collection) {
    int count1 = 0;
    int count2 = 0;

    for (int i = 0; i < collection.length; i++) {
      for (int j = 0; j <collection.length ; j++) {
        if(collection[i]==collection[j]){
          count1++;
        }
        if(count1>count2){
          count2=count1;
        }
      }
      count1=0;
    }
  return count2;
  }

}