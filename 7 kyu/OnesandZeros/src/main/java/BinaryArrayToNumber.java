import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int sum = 0;
        for (int i = binary.size()-1, k =0; i >=0 ; i--, k++) {
            if(binary.get(i) == 1 ) sum +=Math.pow(2, k);
        }
        return sum;
    }
}