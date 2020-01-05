import java.util.*;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        int counter = 0;
        String pattern = "[:;][~\\-]?[)D]";
        for (String s : arr) {
            if (s.matches(pattern)) {
                counter++;
            }
        }
        return counter;
    }
}