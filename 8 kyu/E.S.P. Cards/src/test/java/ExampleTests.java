import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTests {

  @Test
  public void testSquare() {
    final char [][] card = Card.makeSquareCard();
    Card.show(card);
    assertEquals("square", Dinglemouse.nameTheShape(card));
  }
  
  @Test
  public void testDiamond() {
    final char [][] card = Card.makeDiamondCard();
    Card.show(card);
    assertEquals("diamond", Dinglemouse.nameTheShape(card));
  }

  @Test
  public void testCircle() {
    final char [][] card = Card.makeCircleCard();
    Card.show(card);
    assertEquals("circle", Dinglemouse.nameTheShape(card));
  }
  
}