/*Create a method that accepts an array of names, and returns an array of each name with its first letter capitalized.

example

Kata.capMe(new String[] {"jo", "nelson", "jurie"}) // returns new String[] {"Jo", "Nelson", "Jurie"}
Kata.capMe(new String[] {"KARLY", "DANIEL", "KELSEY"}) // returns new String[] {"Karly", "Daniel", "Kelsey"}*/

public class Kata {
    public static String[] capMe(String[] strings) {
        for (int i = 0; i<strings.length; i++) {

            strings[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1).toLowerCase();

        }
        return strings;

    }
}