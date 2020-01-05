public class TipCalculator {

  public static Integer calculateTip(double amount, String rating) {
    return rating.toLowerCase().equals("terrible")? 0 :
            rating.toLowerCase().equals("poor")? (int) (Math.ceil(amount / 100 * 5)) :
                    rating.toLowerCase().equals("good")? (int) Math.ceil(amount / 10) :
                            rating.toLowerCase().equals("great")? (int) Math.ceil(amount / 100 * 15) :
                                    rating.toLowerCase().equals("excellent")? (int) Math.ceil(amount / 100 * 20) : new Integer(0);
  }
}