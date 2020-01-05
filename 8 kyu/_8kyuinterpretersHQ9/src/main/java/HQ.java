public class HQ {

  public static String nine(String s) {

    for (int i = 99 ; i>0; i--){

     s+= i+" bottles of beer on the wall, "+i+" bottles of beer.";
     s+= "Take one down and pass it around, "+(i-1)+" bottles of beer on the wall.";
      if(i<2){
        s+="Take one down and pass it around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.";
      }
  }
  return s;}

  public static String HQ9(char code) {

    switch (code){
      case 'H':
        return "Hello World!";
      case 'Q':
        return code+"";
      case '9':
        System.out.println(nine(""));
          return "";
        }

    return "";
  }
}