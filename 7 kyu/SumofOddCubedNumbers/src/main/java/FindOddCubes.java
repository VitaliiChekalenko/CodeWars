/*Find the sum of the odd numbers within an array, after cubing the initial integers. The function should return undefined/None/nil/NULL if any of the values aren't numbers.

Note: There are ONLY integers in the JAVA and C# versions of this Kata.
https://www.codewars.com/kata/580dda86c40fa6c45f00028a/train/java
*/

import java.util.Arrays;

public class FindOddCubes {
 
 public static int cubeOdd(int arr[]) {
//
//     int sum =0;
//     try {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i]<0){
//                 sum+= (arr[i]*arr[i])*(-1);
//             }else {
//                 sum += arr[i] * arr[i];
//             }
//         }
//         return sum;
//     }catch (Exception e){
//         return Integer.parseInt(null);
//     }

//     int sum = 0;
//     for (int i = 0; i < arr.length; i++) {
//         if((arr[i]*arr[i])%2!=0) {
//             sum+= arr[i]*arr[i]*arr[i];
//         }
//     }
     return  Arrays.stream(Arrays.stream(arr).map(x -> x*x*x).toArray()).sum();
  }
}


/* if(arr[i]<0 && Math.pow(arr[i], 2)%2!=0){
     sum+= Math.pow(arr[i], 2)*(-1);
           System.out.println(Math.pow(arr[i], 2)*(-1));
       }else if(Math.pow(arr[i], 2)%2!=0){
           sum+= Math.pow(arr[i], 2);
           System.out.println(Math.pow(arr[i], 2));
       }*/