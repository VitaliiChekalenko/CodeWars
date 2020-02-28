public class Divisible {
    public static boolean isDivisible(int... nums) {
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==0) return false;
            if (nums[0] % nums[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
