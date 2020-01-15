public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        int count = 0;
        String[] str1arr = str1.split("");
        String[] str2arr = str2.split("");
        for(String i : str2arr){
            int tmp = 0;
            for(String j : str1arr){
                if(i.equals(j)){
                    count++;
                    for(int k = tmp;k<str1arr.length -1;k++){
                        str1arr[k] = str1arr[k+1];
                    }
                    break;
                }
                tmp++;
            }
        }
        return str2.length() == count;
    }
}