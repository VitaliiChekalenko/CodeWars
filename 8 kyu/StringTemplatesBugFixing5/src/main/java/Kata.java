/*String Templates - Bug Fixing #5
Oh no! Timmy hasn't followed instructions very carefully and forgot how to use the new String Template feature, Help Timmy with his string template so it works as he expects!
*/

public class Kata
{
    public static String buildString(String... args) {
        if(args.length==1) return "I like " + args[0]+"!";
        if(args.length==0) return "I like !";
        String res="I like ";
        for(int i=0; i<args.length; i++){
            res+=args[i]+", ";
        }
        return res.substring(0, res.length()-2)+"!";
    }
}