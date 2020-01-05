import java.util.LinkedList;
import java.util.List;

public class Kata13December {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        List<Integer> a = new LinkedList<Integer>();
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i)*listOfNumbers.get(i) % 2 == 1) {
                a.add(listOfNumbers.get(i));
            }
        }
        return a;
    }
}