public class MyUtilities {

    public boolean isDigit(String s) {

        if(s.contains("\\s") ){
            return false;
        }
        return  s.contains("\\d");
    }
}