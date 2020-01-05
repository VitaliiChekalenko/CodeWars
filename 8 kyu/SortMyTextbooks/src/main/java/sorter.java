import java.util.Collections;
import java.util.List;

class sorter {
    public static List<String> sort(List<String> textbooks) {
        Collections.sort(textbooks, String.CASE_INSENSITIVE_ORDER );
        return textbooks;
    }
}