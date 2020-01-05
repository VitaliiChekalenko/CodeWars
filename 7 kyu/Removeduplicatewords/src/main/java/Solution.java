/*Your task is to remove all duplicate words from a string, leaving only single (first) words entries.

Example:

Input:

'alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta'

Output:

'alpha beta gamma delta'
*/

import java.util.*;

class Solution {
    public static String removeDuplicateWords(String s) {

        List<String> list = Arrays.asList(s.split(" "));
        List<String> last = new ArrayList<String>();
        last.add(list.get(0));

        for (int i = 1; i < list.size(); i++) {
            if (!last.contains(list.get(i))) {
                last.add(list.get(i));
            }
        }
        s = "";
        for (int i = 0; i < last.size(); i++) {
            s += last.get(i) + " ";
        }
        return s.trim();
    }
}

//        Stream<String> words = Stream.of(s.split(" "));
//        Set<String> wordsSet = words.collect(Collectors.toCollection(TreeSet::new));
//        s="";
//        Iterator<String> itr = wordsSet.iterator();
//        while(itr.hasNext()){
//            s+=itr.next()+" ";
//        }
//        return s.trim();