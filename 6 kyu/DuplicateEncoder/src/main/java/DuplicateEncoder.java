/* The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.

Examples
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))(("
Notes

Assertion messages may be unclear about what they display in some languages. If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!
*/

public class DuplicateEncoder {
	static String encode(String word){

	    word = word.toLowerCase();
        for (int i = 0; i< word.length(); i++){
             String s = word.substring(i,i+1);
             if(word.substring(i,i+1).equals("(") || word.substring(i,i+1).equals(")")){
                 continue;
             }
            if(word.contains(s)) {
                word=word.replace(s, ")");
                    }
            else{
                word=word.replace(s, "(");
            }
            System.out.print(word.substring(i,i+1));
        }


    return word;
  }
}
