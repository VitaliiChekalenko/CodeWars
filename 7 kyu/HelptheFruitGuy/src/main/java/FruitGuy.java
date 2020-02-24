/*Our fruit guy has a bag of fruit (represented as an array of strings) where some fruits are rotten. He wants to replace all the rotten pieces of fruit with fresh ones. For example, given ["apple","rottenBanana","apple"] the replaced array should be ["apple","banana","apple"]. Your task is to implement a method that accepts an array of strings containing fruits should returns an array of strings where all the rotten fruits are replaced by good ones.

Notes
If the array is null/nil/None or empty you should return empty array ([]).
The rotten fruit name will be in this camelcase (rottenFruit).
The returned array should be in lowercase.

https://www.codewars.com/kata/557af4c6169ac832300000ba/train/java

*/

public class FruitGuy {

    public static String[] removeRotten(String[] fruitBasket) {

        try{
          for (int i = 0; i < fruitBasket.length; i++) {
            if (fruitBasket[i].contains("rotten")) {
                fruitBasket[i] = fruitBasket[i].substring(6).toLowerCase();
            }
        }
        return fruitBasket;
        }catch (NullPointerException e){
            return new String[]{};
        }
    }
}