public class Dinglemouse {

  public static int[] humanYearsCatYearsDogYears(final int humanYears) {

    int catYears = 0, dogYears = 0;


    for( int i = 1; i<=humanYears; i++){
      if(i==1){
        catYears+= 15;
        dogYears+= 15;
        continue;
      }
      if(i==2){
        catYears+= 9;
        dogYears+= 9;
        continue;
      }
      catYears+= 4;
      dogYears+= 5;
    }

    return new int[]{humanYears,catYears,dogYears};
  }

}