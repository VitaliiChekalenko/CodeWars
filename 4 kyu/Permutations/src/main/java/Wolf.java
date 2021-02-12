import java.util.ArrayList;
import java.util.List;

public class Wolf {


    public static void main(String[] args) {
        String input = "Wolf";
        permutation(input, "");
    }
    private static void permutation(String input, String sofar) {
        String s = "";
        List<String> done = new ArrayList<>();
        if (input.equals("")) {
            s+= sofar;

            done.add(s);
             }
        for (int i = 0; i<input.length(); i++) {
            char c = input.charAt(i);
            if (input.indexOf(c, i + 1) != -1)
                continue;
            permutation(input.substring(0, i) + input.substring(i + 1), sofar+c);
        }
        for (int i = 0; i < done.size(); i++) {
//            System.out.println(done.get(i));
        }
    }
}

