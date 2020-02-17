/*Complete the solution so that it strips all text that follows any of a set of comment markers passed in. Any whitespace at the end of the line should also be stripped out.

Example:

Given an input string of:

apples, pears # and bananas
grapes
bananas !apples
The output expected would be:

apples, pears
grapes
bananas
The code would be called like so:

var result = solution("apples, pears # and bananas\ngrapes\nbananas !apples", ["#", "!"])
// result should == "apples, pears\ngrapes\nbananas"

https://www.codewars.com/kata/51c8e37cee245da6b40000bd/train/java
*/

public class StripComments {

	public static String stripComments(String text, String[] commentSymbols) {

		String s = "";
		String[] str = text.split("");

		try{
		for (int i = 0; i <str.length ; i++) {

			for (int j = 0; j < commentSymbols.length; j++) {

			if(str[i].equals(commentSymbols[j])) {
				if(str[i-1].equals(" ")){
					s= s.substring(0, i-1);
				}
				while (!str[i].equals("\n")){
					i++;
				}

			}}

			s+= str[i];
		}} catch (IndexOutOfBoundsException e){
			System.out.println("Буваэ");
		}
		return s.trim();
	}

}
