/*If you can't sleep, just count sheep!!

Task:
Given a number, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep..."

Note:
You will always receive a positive integer.*/

class Kata {
  public static String countingSheep(int num) {
    StringBuilder res= new StringBuilder();
   for(int i=1; i<=num; i++){
     res.append(i).append(" sheep...");
   }
    return res.toString();
  }
}