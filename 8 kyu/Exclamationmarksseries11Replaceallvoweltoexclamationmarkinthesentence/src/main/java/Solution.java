
/*Description:
Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.

Examples
replace("Hi!") === "H!!"
replace("!Hi! Hi!") === "!H!! H!!"
replace("aeiou") === "!!!!!"
replace("ABCDE") === "!BCD!"
Note
Please don't post issue about difficulty or duplicate. Because:
*/
public class Solution {
    public static String replace(final String s) {
        return s.replaceAll("[aeiouAEIOU]", "!");
    }
}