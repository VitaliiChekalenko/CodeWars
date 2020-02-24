//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class MainClass {
//    static List<Integer> done = new ArrayList<>();
//
//    public static void main(String[] args) {
//
//        String[] arr = {"1", "2", "3", "4", "5", "6", "7"};
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
//    }
//
//    static void print(String[] arr) {
//        done.add(Integer.parseInt(String.join("", arr)));
//    }
//
//    static int ret(ArrayList<Integer> e){
//        return e.indexOf(n)
//    }
//
//    static int fuctorial(int n) {
//        return (n > 0) ? n * fuctorial(n - 1) : 1;
//    }
//
//}