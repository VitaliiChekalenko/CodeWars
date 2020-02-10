public class Kata {
    public static boolean smallEnough(int[] a, int limit) {

        for (int e : a) {

            if(e>limit){
                return false;
            }
        }

        return true;
    }
}