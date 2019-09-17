//Find the number of divisors of a positive integer n.
//
//        Random tests go up to n = 500000.
//
//        Examples
//        divisors 4  = 3 -- 1, 2, 4
//        divisors 5  = 2 -- 1, 5
//        divisors 12 = 6 -- 1, 2, 3, 4, 6, 12
//        divisors 30 = 8 -- 1, 2, 3, 5, 6, 10, 15, 30

public class FindDivisor {

  public long numberOfDivisors(int n) {
    int n2=n, count = 0;
    while(n2>0){
      if(n%n2 == 0) count++;
      n2--;
    }
    return count;
  }

}