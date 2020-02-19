//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class Kata {
//    public static long nextSmaller(long n) {
//      String[] s = (n+"").split("");
//        List<String> done = new ArrayList<>();
//        for (int i = 0; i <s.length ; i++) {
//            String num = s[i];
//            for (int j = 0; j <s.length ; j++) {
//                if(j==i){
//                    continue;
//                }
//                num+= s[j];
//            }
//            if(num.charAt(0)=='0'){
//                continue;
//            }
//            done.add(num);
//            //System.out.println(num);
//        }
//        Collections.sort(done);
//        System.out.println(done);
//        System.out.println("_____________________");
//      return Long.parseLong(done.get(0));
//    }
//}

//import java.util.ArrayList;
//import java.util.List;
//
//public class Kata {
//
//    static ArrayList<String> done = new ArrayList<>();
//    static long doneN ;
//    public static long nextSmaller(long n) {
//        doneN=n;
//
//        String[] arr = (n+"").split("");
//
//        int count = fuctorial(arr.length);
//
//
//        int max = arr.length - 1;
//        System.out.println("Вариантов " + count);
//        int shift = max;
//        String t;
//        while (count > 0) {
//            t = arr[shift];
//            arr[shift] = arr[shift - 1];
//            arr[shift - 1] = t;
//            print(arr);
//            count--;
//            if (shift < 2) {
//                shift = max;
//            } else {
//                shift--;
//            }
//        }
//        return ret(Long.parseLong(String.valueOf(done)));
//    }
//
//    static void print(String[] arr) {
//        done.add(String.join("", arr));
//    }
//
//    static String ret(ArrayList<String> e){
//        int s = e.indexOf(doneN);
//        System.out.println(e.indexOf(doneN));
//        System.out.println(e.get(e.indexOf(doneN)-1));
//        return e.get(e.indexOf(doneN)-1);
//    }
//
//    static int fuctorial(int n) {
//        return (n > 0) ? n * fuctorial(n - 1) : 1;
//    }
//
//}


//public class Kata {
//    public static long nextSmaller(long n) {
//
//        String[] s = (String.valueOf(n)).split("");
//        String temp ="";
//        for (int i = 1; i <s.length ; i++) {
//            for (int j = 1; j <s.length ; j++) {
//                if(Integer.parseInt(s[s.length-(i)])<Integer.parseInt(s[s.length-(j+1)])){
//                temp = s[s.length-(i)];
//                s[s.length-i] = s[s.length-(j+1)];
//                s[s.length-(j+1)] = temp;
//                return Long.parseLong(String.join("", s));
//            }}
//        }
//        return -1;
//    }
//}

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class Kata {
//    public static long nextSmaller(long n) {
//
//        List<String> s = Arrays.asList(String.valueOf(n).split(""));
//
//
//        while (String.valueOf(n).length()== s.size() ){
//            List<String> temp = Arrays.asList(String.valueOf(n - 1).split(""));
//            List<String> temp1 = s;
//            int count = 0;
//            for (int i = 0; i < s.size(); i++) {
//
//
//                if(temp.contains(temp1.get(i))){
//                    count++;
//                    temp1.remove(i);
//
//                }
//               if(count==s.size()){
//                   return Long.parseLong(String.join("", temp));
//               }
//
//            }
////            if(s.containsAll(temp)){
////                return Long.parseLong(String.join("", temp));
////            }
//            n--;
//        }
//        return -1;
//    }
//}


import java.util.Arrays;

public class Kata {
    public static long nextSmaller(long n) {
        char[] s = String.valueOf(n).toCharArray();
        for (int i = s.length - 2; i >= 0; i--) {
            for (int j = s.length - 1; j > i; j--) {
                if (s[i] > s[j]) {
                    char tmp = s[j];
                    s[j] = s[i];
                    s[i] = tmp;
                    Arrays.sort(s, i + 1, s.length);
                    return Long.valueOf(String.valueOf(s));
                }
            }
        }
        return -1;
    }
}