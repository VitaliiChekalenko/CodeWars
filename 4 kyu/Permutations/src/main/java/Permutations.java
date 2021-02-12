import java.util.ArrayList;
import java.util.List;

class Permutations {
    static List<String> done = new ArrayList<>();

    public static List<String> singlePermutations(String s) {
        permutation(s, "");
        List<String> a = new ArrayList<>(done);
        done.clear();
        return a;
    }

    private static void permutation(String input, String sofar) {
        String s = "";

        if (input.equals("")) {
            s += sofar;
            done.add(s);
        }
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (input.indexOf(c, i + 1) != -1)
                continue;
            permutation(input.substring(0, i) + input.substring(i + 1), sofar + c);
        }
    }
}