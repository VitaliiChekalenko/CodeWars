public class WeightSort {

    public static String orderWeight(String strng) {
        String[] done = strng.split(" ");
        String str = "";

        for (int i = 0; i<done.length; i++) {
            String[] aa = done[i].split("");
            int sum = 0;
            for(int j=0; j<aa.length; j++){
                sum += Integer.parseInt(aa[j]);
            }
            if(sum>)
        }

        return done;
    }
}