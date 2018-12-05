//Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.

public class FakeBinary {
    public static String fakeBin(String numberString) {

        String[] numberString1 = new String[numberString.length()-1];
                String res="";
        if (numberString==null) return res;
        for(int i=0; i<numberString.length(); i++){
            if(Integer.parseInt(numberString1[i]) < 5) {
                res+=0;
            } else res+=1;
        }
    return res;
    }
}

/*
    public static String fakeBin(String numberString) {
        String result = "";
        for (String s : numberString.split("")){
            if (Integer.parseInt(s) < 5)
                result += 0;
            else result += 1;
        }
        return result;
    }*/
