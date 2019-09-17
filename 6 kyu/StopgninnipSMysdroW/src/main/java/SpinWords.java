public class SpinWords {

  public String spinWords(String sentence) {
    String[] str = sentence.split(" ");
    String done = "";
      if (str.length == 1 && str[0].length()<5) return  sentence;

        for (String s: str  ) {

          if (s.length()<5){
          done += s;
      }

          if(s.length()>4){

            for(int i = s.length()-1; i>=0; i--)
       done += s.charAt(i) ;
      }
      done+= " ";

    }
    return done.trim();
  }
}