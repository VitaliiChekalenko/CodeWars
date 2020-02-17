import java.math.BigInteger;
public class SumFct {
    public static BigInteger perimeter(BigInteger n) {
        return fib(n);
    }

    static BigInteger fib(BigInteger n)
    {
        if (n.equals(1))
            return n;
        return fib(n.subtract(BigInteger.valueOf(1))).add(fib(n.subtract(BigInteger.valueOf(2))));
    }
}