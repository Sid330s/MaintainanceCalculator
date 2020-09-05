public class TestApp {
    public static void main(String[] args) {
        Room room = new Room(5,5,5);

        House house = new House(5,5);
        house.addRoom(room);
        int cost = house.getCostofPaint();
        int mainCost = house.getMaintenanceCost();

        Colony colony = new Colony();
        String colonyName = colony.getColonyName();
        colony.addHouse(house);
        int colonyMaintenanceCost = colony.getMaintenanceCost();
    }
}
