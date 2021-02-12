import java.util.ArrayList;


public class Kata {
    public static int nextId(int[] ids) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < ids.length; i++) {
            temp.add(ids[i]);
        }
        for (int i = 0; i < 200000; i++) {
            if(!temp.contains(i)){
                return i;
        }
        }
        return 0;
    }
}