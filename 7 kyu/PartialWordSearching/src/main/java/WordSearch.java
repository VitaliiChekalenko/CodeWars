/*Write a method that will search an array of strings for all strings that contain another string, ignoring capitalization. Then return an array of the found strings.

The method takes two parameters, the query string and the array of strings to search, and returns an array.

If the string isn't contained in any of the strings in the array, the method returns an array containing a single string: "Empty" (or Nothing in Haskell, or "None" in Python and C)

Examples
If the string to search for is "me", and the array to search is ["home", "milk", "Mercury", "fish"], the method should return ["home", "Mercury"].

https://www.codewars.com/kata/54b81566cd7f51408300022d/train/java

*/

import java.util.ArrayList;
import java.util.List;

class WordSearch {
    static String[] findWord(String x, String[] y) {

        List<String> s = new ArrayList<String>();
        String regex = ".*" + x + ".*";

        for (int i = 0; i < y.length; i++) {
            if (y[i].toLowerCase().matches(regex)) {
                s.add(y[i]);
            }
        }

        String[] res = new String[s.size()];
        for (int i = 0; i < s.size(); i++) {
            res[i] = s.get(i);
        }
        return res.length==0? new String[]{"Empty"}: res;
    }
}