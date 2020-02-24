/*Your friend won't stop texting his girlfriend. It's all he does. All day. Seriously. The texts are so mushy too! The whole situation just makes you feel ill. Being the wonderful friend that you are, you hatch an evil plot. While he's sleeping, you take his phone and change the autocorrect options so that every time he types "you" or "u" it gets changed to "your sister."

Write a function called autocorrect that takes a string and replaces all instances of "you" or "u" (not case sensitive) with "your sister" (always lower case).

Return the resulting string.

Here's the slightly tricky part: These are text messages, so there are different forms of "you" and "u".

For the purposes of this kata, here's what you need to support:

"youuuuu" with any number of u characters tacked onto the end
"u" at the beginning, middle, or end of a string, but NOT part of a word
"you" but NOT as part of another word like youtube or bayou


https://www.codewars.com/kata/538ae2eb7a4ba8c99b000439/train/java

*/

public class Kata {
  public static String autocorrect(String input) {

    String[] s = input.split(" ");

    for (int i = 0; i <s.length ; i++) {
      if(s[i].toLowerCase().matches("u|you|you+")  ){
        s[i] = "your sister";
      }
      if(s[i].toLowerCase().matches("you[\\W^]?" )){
          s[i] = "your sister"+ s[i].substring(s[i].length()-1);
      }
    }
    return String.join(" ", s);
  }
}