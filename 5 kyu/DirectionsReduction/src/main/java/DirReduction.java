import java.util.Arrays;
import java.util.LinkedList;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        LinkedList<String> done = new LinkedList<String>(Arrays.asList(arr));

        for (int i = 0; i < done.size() - 1; i++) {
            if (done.get(i).equals("NORTH") && done.get(i + 1).equals("SOUTH") ||
                    done.get(i).equals("SOUTH") && done.get(i + 1).equals("NORTH")) {
                System.out.println(done.get(i) +"       "+done.get(i + 1) );
                done.remove("NORTH");
                done.remove("SOUTH");
                System.out.println(done);
                i--;
                continue;
            }

            if(done.get(i).equals("WEST") && done.get(i+1).equals("EAST") ||
                    done.get(i).equals("EAST") && done.get(i+1).equals("WEST")){
                System.out.println(done.get(i) +"       "+done.get(i + 1) );

                done.remove("WEST");
                done.remove("EAST");
                System.out.println(done);
                i-=2;
            }
        }


        String[] a = new String[done.size()];
        for(int i = 0; i<done.size(); i++){
            a[0] = done.get(i);
        }
        return a;
    }
}
