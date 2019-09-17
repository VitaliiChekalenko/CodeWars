public class Solution {

  public static boolean isAscOrder(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      if(arr[i-1]<=arr[i]) continue;
      else return false;
    }
    return true;
  }

}
