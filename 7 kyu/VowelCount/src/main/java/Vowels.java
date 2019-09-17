public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    String[] Str= str.split("");
    for(int i=0; i<Str.length; i++){
      if(Str[i].equals("a") || Str[i].equals("e") || Str[i].equals("i") || Str[i].equals("o") || Str[i].equals("u") ) {
        vowelsCount++;
      }
      }
     
    return vowelsCount;
  }

}