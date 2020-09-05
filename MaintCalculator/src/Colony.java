import java.util.ArrayList;
import java.util.List;

public class Colony {
    private String colonyName;
    private List<House> houses;
    final static int lowerFloorDiscount = 100;
    final static int lowerFloorLimit = 3;
    final static int housesLimit = 10;

    public Colony(){
        houses = new ArrayList<House>(10);
    }
    public String getColonyName() {
        return colonyName;
    }

    public void setColonyName(String colonyName) {
        this.colonyName = colonyName;
    }

    public void addHouse(House house) {

    }

    public int getMaintenanceCost() {
        int mainCost = 0;
        for (House house :houses) {
            mainCost+=house.getMaintenanceCost();
            if(house.getHouseNumber() <= lowerFloorLimit){
                mainCost-=lowerFloorDiscount;
            }
        }
        return mainCost;
    }
}
