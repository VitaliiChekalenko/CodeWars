/*Numbers ending with zeros are boring.

They might be fun in your world, but not here.

Get rid of them. Only the ending ones.

1450 -> 145
960000 -> 96
1050 -> 105
-1050 -> -105
Zero alone is fine, don't worry about it. Poor guy anyway
*/

public class NoBoring {
    public static int noBoringZeros(int n) {
        String s = n+"";
        if(n==0){
            return n;
        }
        while(s.substring(s.length()-1).contains("0")){
            s = s.substring(0, s.length()-1);
        }
        return Integer.parseInt(s);
    }
}