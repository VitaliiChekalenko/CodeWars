package org.example;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static Object[] removeEveryOther(Object[] arr) {
        Object[] output = new Object[(arr.length + 1) / 2];

        for (int i = 0; i < output.length; i++) {
            output[i] = arr[i * 2];
        }

        return output;
    }
//        List<Object> a = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (i%2 == 0) {
//                a.add(arr[i]);
//            }
//        }
//        Object[] res = new Object[a.size()];
//        for (int i = 0; i < a.size(); i++) {
//            res[i] = a.get(i);
//        }
//        return res;
    }
}