//ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
//
//        If the function is passed a valid PIN string, return true, else return false.
//
//        eg:
//
//        Solution.validatePin("1234") === true
//        Solution.validatePin("12345") === false
//        Solution.validatePin("a234") === false


public class Solution {

  public static boolean validatePin(String pin) {

    if(pin.matches("\\d+")  && (pin.length() == 4 || pin.length() == 6 )){
      return true;
    }else{
    return false;
  }}

}