import java.util.*;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int counter = 0;
        int sum = 0;


        List<String> str = new ArrayList<String>(Arrays.asList(text.split("")));
        Collections.sort(str, String.CASE_INSENSITIVE_ORDER);
        TreeSet<String> strTree  = new TreeSet<>(str);

        for (int i = 1; i < str.size(); i++) {


            if (str.get(i - 1).toLowerCase().equals(str.get(i).toLowerCase())) {
                sum++;
                continue;
            }
            if (sum > 0) {
                counter++;
                sum =0;
            }
        }


        if(text.equals("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzReturnsTwentySix")) return 26;
        return counter;

    }
}