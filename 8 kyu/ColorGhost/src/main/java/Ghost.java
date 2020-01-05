import java.util.Random;

public class Ghost {
  public String color;
  
  public Ghost(){}

  public String getColor(){
      String[] s = new String[]{"yellow", "red", "white", "purple"};
      Random generator = new Random();
      int randomIndex = generator.nextInt(s.length);
      return s[randomIndex];

  }
  
  public void setColor(String color){
   this.color= color;}

    public static void main(String[] args) {
        Ghost ghost = new Ghost();

        ghost.getColor();
    }
   }