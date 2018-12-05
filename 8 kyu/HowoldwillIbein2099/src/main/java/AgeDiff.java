/*Philip's just turned four and he wants to know how old he will be in various years in the future such as 2090 or 3044. His parents can't keep up calculating this so they've begged you to help them out by writing a programme that can answer Philip's endless questions.

Your task is to write a function that takes two parameters: the year of birth and the year to count years in relation to. As Philip is getting more curious every day he may soon want to know how many years it was until he would be born, so your function needs to work with both dates in the future and in the past.

Provide output in this format: For dates in the future: "You are ... year(s) old." For dates in the past: "You will be born in ... year(s)." If the year of birth equals the year requested return: "You were born this very year!"

"..." are to be replaced by the number, followed and proceeded by a single space. Mind that you need to account for both "year" and "years", depending on the result.

Good Luck!*/

public class AgeDiff {
  public static String CalculateAge(int birth, int yearTo) {
    if (birth==yearTo) return "You were born this very year!";
    if (birth-yearTo==1) return "You will be born in 1 year.";
    if (yearTo-birth==1) return "You are 1 year old.";
    return birth<yearTo? "You are "+(yearTo-birth)+" years old.":"You will be born in "+(birth-yearTo)+" years.";
  }
}