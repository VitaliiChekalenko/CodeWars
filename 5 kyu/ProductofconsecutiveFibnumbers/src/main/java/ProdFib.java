/*The Fibonacci numbers are the numbers in the following integer sequence (Fn):

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...

such as

F(n) = F(n-1) + F(n-2) with F(0) = 0 and F(1) = 1.

Given a number, say prod (for product), we search two Fibonacci numbers F(n) and F(n+1) verifying

F(n) * F(n+1) = prod.

Your function productFib takes an integer (prod) and returns an array:

[F(n), F(n+1), true] or {F(n), F(n+1), 1} or (F(n), F(n+1), True)
depending on the language if F(n) * F(n+1) = prod.

If you don't find two consecutive F(m) verifying F(m) * F(m+1) = prodyou will return

[F(m), F(m+1), false] or {F(n), F(n+1), 0} or (F(n), F(n+1), False)
F(m) being the smallest one such as F(m) * F(m+1) > prod.

Examples
productFib(714) # should return {21, 34, 1},
                # since F(8) = 21, F(9) = 34 and 714 = 21 * 34

productFib(800) # should return {34, 55, 0},
                # since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 < 800 < 34 * 55
Notes: Not useful here but we can tell how to choose the number n up to which to go: we can use the "golden ratio" phi which is (1 + sqrt(5))/2 knowing that F(n) is asymptotic to: phi^n / sqrt(5). That gives a possible upper bound to n.

You can see examples in "Example test".

References
http://en.wikipedia.org/wiki/Fibonacci_number

http://oeis.org/A000045*/

import java.util.ArrayList;
import java.util.List;

public class ProdFib {
	public static long[] productFib(long prod) {
		long n = 0;
		long nPlus = 1;
		while (n * nPlus < prod) {
			nPlus = n + nPlus;
			n = nPlus - n;
		}
		return (n * nPlus) == prod ? new long[]{n, nPlus, 1} : new long[]{n, nPlus, 0};
	}
}
/*List<Integer> list = new ArrayList<Integer>(){};
		list.add(0);
		list.add(1);

		for(int i =0; i<prod; i++){
			list.add(list.get(i)+list.get(i+1));
			System.out.println(list.get(i)+"|||||"+list.get(i+1));

			if(list.get(i)*list.get(i+1)== prod){
				return new long[]{list.get(i),list.get(i+1), 1};
			}else if(list.get(i)*list.get(i+1)>prod){
				return new long[]{list.get(i),list.get(i+1),0};
			}
		}
		return new long[1];*/

/*public static long[] productFib(long prod) {
		if(prod<=1) {
			return new long[]{1, 1, 1};		}
		long[] list = new long[(int) ((1 + Math.sqrt(prod))/2)];
		list[0] = 0;
		list[1]= 1;

		for(int i =0; i<(1 + Math.sqrt (prod)) / 2; i++){
			list[i+2]=list[i]+list[i+1];
			System.out.println(list[i]+"|||||"+list[i+1]);

			if(list[i]*list[i+1]== prod){
				return new long[]{list[i],list[i+1], 1};
			}else if(list[i]*list[i+1]>prod){
				return new long[]{list[i],list[i+1], 0};			}
		}
		return new long[1];

	}*/