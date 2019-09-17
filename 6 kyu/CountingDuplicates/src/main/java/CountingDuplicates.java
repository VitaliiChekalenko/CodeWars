import java.util.ArrayList;
import java.util.Arrays;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
   ArrayList<String> str = new ArrayList(Arrays.asList(text.toLowerCase().split("")));
   int sum=0;
      for (int i = 0, j = 1; i <str.size()-1 ;  j++) {


             System.out.print(str.get(i));
             System.out.println("        "+str.get(j));

             if (str.get(i).equals(str.get(j))) {
                 sum++;
                 i++;


             }
                 System.out.print(sum);
                 System.out.println("        "+str);



         }


        return sum;
}}