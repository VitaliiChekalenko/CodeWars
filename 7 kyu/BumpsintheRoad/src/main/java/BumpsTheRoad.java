/*Your car is old, it breaks easily. The shock absorbers are gone and you think it can handle about 15 more bumps before it dies totally.

Unfortunately for you, your drive is very bumpy! Given a string showing either flat road ("_") or bumps ("n"), work out if you make it home safely. 15 bumps or under, return "Woohoo!", over 15 bumps return "Car Dead".

https://www.codewars.com/kata/57ed30dde7728215300005fa/train/java

*/

public class BumpsTheRoad {
  public static String bumps(final String road) {
    return (road.replaceAll("_","")).length()>15? "Car Dead":"Woohoo!" ;
  }
          }