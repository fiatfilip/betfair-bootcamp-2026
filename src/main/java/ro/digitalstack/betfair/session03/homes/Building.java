package ro.digitalstack.betfair.session03.homes;
import java.util.*;

public class Building {

    class Room{

        private String roomType;

        public Room(String roomType) {
            this.roomType = roomType;
            addRoom(this);
        }

        public String getRoomType() {
            return roomType;
        }
    }

    private List<Room> rooms = new ArrayList<>();

    private void addRoom(Room room){
        rooms.add(room);
    }

    public void listRooms(){
        for (Room room : rooms
             ) {
            System.out.println(room.getRoomType());
        }
    }

    public static void main(String[] args) {

        Building building = new Building();
        Room room = building.new Room("Living room");
        //building.addRoom(room);
        building.new Room("Kitchen");
        building.listRooms();

    }

}
