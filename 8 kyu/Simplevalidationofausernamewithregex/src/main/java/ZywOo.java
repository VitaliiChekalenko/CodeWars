/*Write a simple regex to validate a username. Allowed characters are:

lowercase letters,
numbers,
underscore
Length should be between 4 and 16 characters (both included).

*/


public class ZywOo {
  public static boolean validateUsr(String s) {

    return  s.matches("[\\p{Ll}\\d\\_]{4,16}");
  }
}