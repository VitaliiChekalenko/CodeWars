/*Welcome. In this kata, you are asked to square every digit of a number.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.

Note: The function accepts an integer and returns an integer*/

public class SquareDigit {

  public int squareDigits(int n) {
    String[] arr= (""+n).split("");
    String almost= "";
    for(int i=0; i<arr.length; i++){
      almost+= Integer.parseInt(arr[i])*Integer.parseInt(arr[i]);
    }
    return Integer.parseInt(almost);
  }

}