public class TenMinWalk {
  public static boolean isValid(char[] walk) {

    int counter = 0;
    for (char i: walk ) {
        switch (i){
          case 'n': counter++; continue;
          case 's': counter--; continue;
          case 'w': counter+= 2; continue;
          case 'e': counter-=2; continue;
        }
    }

    if(walk.length ==10 && counter==0){
      return  true;
    }
    return false;
  }
}