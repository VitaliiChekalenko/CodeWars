
/*You are the owner of a box making company.

Your company can produce any equal sided polygon box, but plenty of your customers want to transport circular objects in these boxes. Circles are a very common shape in the consumer industry. Tin cans, glasses, tyres and CD's are a few examples of these.

As a result you decide to add this information on your boxes: The largest (diameter) circular object that can fit into a given box.*/

public class Polygon {
    int sides;
    int sideLength;

    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double circleDiameter() {
       return sides/2;
    }

}