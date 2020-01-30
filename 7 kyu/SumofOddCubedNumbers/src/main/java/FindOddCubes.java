public class FindOddCubes {
 
 public static int cubeOdd(int arr[]) {
 int sum = 0;
 
 for (int i=0; i<arr.length; i++){

     sum+= Math.pow(arr[i], 2);

   }

   return sum;
  }
}


/* if(arr[i]<0 && Math.pow(arr[i], 2)%2!=0){
     sum+= Math.pow(arr[i], 2)*(-1);
           System.out.println(Math.pow(arr[i], 2)*(-1));
       }else if(Math.pow(arr[i], 2)%2!=0){
           sum+= Math.pow(arr[i], 2);
           System.out.println(Math.pow(arr[i], 2));
       }*/