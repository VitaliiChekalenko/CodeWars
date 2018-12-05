//Create a function which answers the question "Are you playing banjo?".
//        If your name starts with the letter "R" or lower case "r", you are playing banjo!
public class Banjo {
  public static String areYouPlayingBanjo(String name) {
//      return String.valueOf(name.charAt(0));
    return (String.valueOf(name.charAt(0))=="R" || String.valueOf(name.charAt(0))=="r")? name + " plays banjo":name + " does not play banjo";
  }
}