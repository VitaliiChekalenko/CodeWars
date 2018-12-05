/*Write a function that returns the total surface area and volume of a box as an array: [area, volume].*/

public class Kata {
    public static int[] getSize(int w,int h,int d) {
        return new int[]{(d * w + d * h + w * h) * 2,w*h*d};
    }
}