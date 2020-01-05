public class CodeWarsMath {
    public static int nearestSq(final int n) {
        for(int i = n, j=n; i>0; i++,j--){
            if(Math.sqrt(i)%1 == 0){
                return i;
            }
            if(Math.sqrt(j)%1 == 0){
                return j;
            }
        }
        return n;
    }

}