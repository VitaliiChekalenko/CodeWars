public class Kata {
  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    if(firstAttacker.equals(fighter1.name)){
    while(fighter1.health >0 || fighter2.health>0){
      fighter2.health-= fighter1.damagePerAttack;
      if(fighter1.health <=0 || fighter2.health<=0) break;
      fighter1.health-= fighter2.damagePerAttack;
      if(fighter1.health <=0 || fighter2.health<=0) break;
    }}else{
      while(fighter1.health >0 || fighter2.health>0){
        fighter1.health-= fighter2.damagePerAttack;
        if(fighter1.health <=0 || fighter2.health<=0) break;
        fighter2.health-= fighter1.damagePerAttack;
        if(fighter1.health <=0 || fighter2.health<=0) break;
      }}

    return fighter1.health> fighter2.health? fighter1.name:fighter2.name;
  }
}
