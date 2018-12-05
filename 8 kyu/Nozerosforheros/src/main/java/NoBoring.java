import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoBoring {
    public static int noBoringZeros(int n) {
        String a= n+"";
        StringBuilder res = new StringBuilder();
        String[] arr= a.split("");
        for(int i=arr.length-1; i>0; i--){
            if((Integer.parseInt(arr[i])>=1) || Integer.parseInt(arr[i])<=-1) {
                break;
            }
            res= arr

        }
        return Integer.parseInt(Arrays.toString(arr).trim());

    }
}

/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoBoring {
    public static int noBoringZeros(int n) {
        List<String> array = new ArrayList<>(Arrays.asList(String.valueOf(n).split("")));
        for (int i = array.size() - 1; i >= 0; i--) {
            if (Integer.parseInt(array.get(i)) == 0)
                array.remove(i);
            else break;
        }
        String result = "";
        for (String arr : array) {
            result += arr;
        }
        return result.length() == 0 ? 0 : Integer.parseInt(result);
    }
}*/
