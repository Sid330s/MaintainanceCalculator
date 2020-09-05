import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {

    @Test
    public void getLateral() {
        Room room = new Room(5);
        assertTrue(room.getLateral()==100);

         room = new Room(6);
        assertTrue(room.getLateral()==144);

    }

    @Test
    public void getFloorArea() {
    }

    @Test
    public void getPersons() {
//        Room room = new Room(5);
//        room.setPersons(6);
//        assertTrue(room.getPersons()==6);
//
//        room.setPersons(3);
//        assertTrue(room.getPersons()==3);
    }
}