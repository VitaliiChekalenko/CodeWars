//https://www.codewars.com/kata/596ef174e4cab6813600004d/train/java

public class Dinglemouse {

  public static String nameTheShape(final char[][] card) {

    return (card[2][10])!=' '? "diamond": card[3][6]!=' '? "square": "circle";
  }

}