import java.util.Arrays;

public class AreSame {

    public static boolean comp(int[] a, int[] b) {

        if (a == null  || b == null  || a.length> b.length || a.length< b.length){

            return false;
        }
        if (b.length == 0 || a.length == 0){
            System.out.println("a or b are empty or not empty lists.");
        }

        for (int i = 0; i < a.length; i++) {
            for (int j =0; j<b.length; j++){
            if (a[i] * a[i] == b[j]) {
                continue;

            }}return false;

        }
        return true;
    }
}