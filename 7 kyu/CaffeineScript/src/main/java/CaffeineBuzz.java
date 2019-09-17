public class CaffeineBuzz {
  public static String caffeineBuzz(int n){
    return (n%2==0 && n%3==0 && n%4==0)? "CoffeeScript": (n%2==0 && n%3==0)? "JavaScript": (n%3==0 && n%4==0)? "Coffee":
            (n%3==0)? "Java": "mocha_missing!";
  }
}