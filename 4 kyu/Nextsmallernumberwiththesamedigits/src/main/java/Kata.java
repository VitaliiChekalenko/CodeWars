import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kata {

    List<String> glo = new ArrayList<>();
    static List<String> cop = new ArrayList<>();


    public static long nextSmaller(long n) {


   String[] s = (n+"").split("");
   List<Integer> co = new ArrayList<>();


        for (int i = 0; i <s.length ; i++) {
           co.add(Integer.parseInt(s[i]));
        }

        permute(co, 0);

        return 1;




//
//        List<String> list = new ArrayList<>();
//
//
//        for (int i = 0; i <s.length ; i++) {
//            String temp = s[i];
//            for (int j = 0; j <s.length ; j++) {
//                if(i==j){
//                    continue;
//                }
//                temp+= s[j];
//            }
//            list.add(temp);
//
//        }
//        int[] done = new int[list.size()];
//
//        for (int i = 0; i < done.length; i++) {
//            done[i] = Integer.parseInt(list.get(i));
//        }
//
//        Arrays.sort(done);
//        System.out.println(Arrays.toString(done));
//
//      return done[done.length-2];
    }

    static void permute(List<Integer> arr, int k){
        for(int i = k; i < arr.size(); i++){
            Collections.swap(arr, i, k);
            permute(arr, k+1);
            Collections.swap(arr, k, i);
        }
        if (k == arr.size() -1){
            cop.addAll(Collections.singleton(arr.toString().join("")));
        }
    }
}