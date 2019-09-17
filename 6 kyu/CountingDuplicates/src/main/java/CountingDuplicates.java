import java.util.*;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int counter = 0;


        List<String> str = new ArrayList<String>(Arrays.asList(text.split("")));
        Collections.sort(str, String.CASE_INSENSITIVE_ORDER);
        TreeSet<String> strTree  = new TreeSet<>(str);

        for (int i = 1; i < text.length(); i++) {
            int sum = 0;
            if (str.get(i - 1).toLowerCase().equals(str.get(i).toLowerCase())) {
                sum++;
                continue;
            }
            if (sum > 0) {
                counter++;
            }
        }

        System.out.println(str);
        System.out.println(strTree);

        return counter;

    }
}