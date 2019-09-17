import java.util.ArrayList;

public class DRoot {
  public static int digital_root(int n) {

//    String[] s = (n+"").split("");
//    ArrayList<Integer> str = new ArrayList<Integer>();
//    int done;
//
//    for(int i = 0; i< s.length; i++){
//      str.add(Integer.parseInt(s[i]));
//    }
//        do{
//        done = 0;
//
//          for(Integer a : str){
//          done += a;
//      }
//          str.clear();
//          for(int i = 0; i< (done+"").length(); i++){
//            str.add(Integer.parseInt(String.valueOf((done+"").charAt(i))));
//          }
//
//      } while (done > 10);
//
//    return done;
    return (n != 0 && n%9 == 0) ? 9 : n % 9;
 }

  }
