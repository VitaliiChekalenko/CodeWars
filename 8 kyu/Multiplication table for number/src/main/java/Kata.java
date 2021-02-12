class Kata {
    public static String multiTable(int num) {

        String res = "";
        for (int i = 1; i < 11; i++) {
            res = res + i +" * "+ num + " = " + (i*num)+"\n";
        }
        return res.trim(); // good luck
    }
}