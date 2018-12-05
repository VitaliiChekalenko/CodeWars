//Get the number n (n>0) to return the reversed sequence from n to 1.
//
//        Example : n=5 >> [5,4,3,2,1]

public class Sequence{

  public static int[] reverse(int n){
  int[] res= new int[n+1];
    for(int i=n, j=0; i>=1; i--, j++ ){
        res[j]= i;
    }
  return res;
  }

}