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

	    String[] s = word.toLowerCase().split("");
	    int counter = 0;
	    String done = "";
        for (int i = 0; i< s.length; i++){
            for (int j = 0; j<s.length; j++){
                if(s[i].equals(s[j])){
                    counter++;
                }
            }
            if(counter>1){
                done+= ")";
                counter=0;
            }
            else{
                done+= "(";
                counter=0;
            }
        }


    return done;
  }
}
