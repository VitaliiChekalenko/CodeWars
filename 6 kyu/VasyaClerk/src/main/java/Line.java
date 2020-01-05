public class Line {
    public static String Tickets(int[] peopleInLine) {

        int cash25= 0, cash50 = 0, cash100 = 0 ;
              if(peopleInLine[0]>=26){
            return "NO";
        }

        for (int k : peopleInLine) {
            switch (k){
                case 25:
                    cash25++;
                    continue;
                case 50:
                    cash25--;
                    cash50++;
                    continue;
                case 100:
                    if(cash25>=3 ) {
                        cash100++;
                        cash25-=3;
                        continue;
                    }
                    if((cash50>=1&&cash25>=2)){
                        cash25--;
                        cash50--;
                        continue;
                    }
                    return "NO";
            }
        }
        return "YES";
    }
}