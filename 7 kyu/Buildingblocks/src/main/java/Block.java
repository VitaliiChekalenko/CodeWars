public class Block {


    private int[] ints;


    public Block(int[] ints){
        this.ints = ints;
    }

    public int getWidth(){
        return ints[0];
    }

    public int getLength() {
        return ints[1];
    }

    public int getHeight() {
        return ints[2];
    }

    public int getVolume() {
        return ints[0]*ints[1]*ints[2];
    }

    public int getSurfaceArea() {
        return (2*ints[1]*ints[2])+(2*ints[1]*ints[0])+(2*ints[2]*ints[0]);
    }

}
