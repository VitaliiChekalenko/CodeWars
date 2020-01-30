public class FindOddCubes {
 
 public static int cubeOdd(int arr[]) {
 int sum = 0;
 
 for (int i=0; i<arr.length; i++){
   
   if(arr[i]%2!=0){
     sum+= Math.pow(arr[i], 2);
   }
 
 }
  
   return sum;
  }
}