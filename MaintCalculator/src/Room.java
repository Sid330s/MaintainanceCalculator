public class Room {

    private int length;
    private int breadth;
    private int height;

    public Room(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public Room(int cube){
        this(cube,cube,cube);
    }


    public int getLateral() {
        return 2*(height*length + height*breadth);
    }

    public int getFloorArea() {
        return length*breadth;
    }
}
