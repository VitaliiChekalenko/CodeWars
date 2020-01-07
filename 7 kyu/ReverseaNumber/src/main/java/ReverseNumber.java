public class ReverseNumber {

    public static int reverse(int number) {
          return number < 0 ? Integer.parseInt(new StringBuilder().append((Math.abs(number) + "")).reverse().toString()) * (-1) :
                Integer.parseInt(new StringBuilder().append(Integer.parseInt(Math.abs(number) + "")).reverse().toString());
    }

}
