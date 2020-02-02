public class Tortoise {
    public static int[] race(int v1, int v2, int g) {

       int h = g/(v2-v1);
        int m = (g % (v2-v1)) * 60 / (v2-v1);
        int s = (((g % (v2-v1)) * 60) % (v2-v1)) * 60 / (v2-v1);
        return  v1 >= v2? null:new int[] {h, m, s};
    }
}