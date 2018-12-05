public class Ghost {
  public String color;
  
  public Ghost(){}
  
  public String getColor(){
  return color;
  }
  
  public void setColor(String color){
   this.color= color;}

  public static void main(String[] args) {
    Ghost go= new Ghost();
    go.setColor("yellow");
    System.out.println(go.getColor());
  }
}