import java.util.ArrayList;
import java.util.List;

public class House {
    final static int waterCharge = 300;
    final static int powerCharge = 600;
    final static int paintSqMtCharge = 5;
    final static int landTaxSqMtCharge = 40;
    final static int maxRoomLimit = 5;
    private final int houseNumber;
    private final int numberOfPeople;


    private List<Room> rooms;

    public House(int houseNumber, int numberOfPeople){
        this.houseNumber = houseNumber;
        this.numberOfPeople = numberOfPeople;
        rooms = new ArrayList<Room>(10);
    }
    public boolean addRoom(Room room) {
        if(rooms.size() < maxRoomLimit) {
            rooms.add(room);
            return true;
        }
        return false;
    }

    public int getCostofPaint() {
        int paintCost = 0;
        for (Room room :rooms) {
            paintCost += (paintSqMtCharge * room.getLateral());
        }
        return paintCost;
    }

    public int getMaintenanceCost() {
        int mainCost = 0;
        for (Room room :rooms) {
            mainCost += (numberOfPeople * waterCharge) +
                    (numberOfPeople * powerCharge) +
                    (landTaxSqMtCharge * room.getFloorArea()) +
                    (paintSqMtCharge * room.getLateral());

        }
        return mainCost;
    }

    public int getHouseNumber() {
        return houseNumber;
    }
}
