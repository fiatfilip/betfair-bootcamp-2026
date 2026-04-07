package ro.digitalstack.betfair.session3.homes;

import java.util.ArrayList;
import java.util.List;

public class Building {
    class Room{
        private String roomType;

        public Room(String roomType){
            this.roomType = roomType;
            addRoom(this);
        }

        public String getRoomType(){
            return roomType;
        }
    }

  private List<Room> rooms = new ArrayList<>();

    private void addRoom(Room room){
        rooms.add(room);
    }

    public void listRooms(){
        for(Room room : rooms){
            System.out.println(room.getRoomType());
        }
    }
    public static void main(String[] args) {
        Building building = new Building();
        Room room = building.new Room("Living Room");
        building.new Room("Room 1");
        building.listRooms();
    }
}

