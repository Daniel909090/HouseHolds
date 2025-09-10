package House;

import java.util.ArrayList;
import java.util.List;

import House.Occupant.*;
import House.Room.*;

public class House {
    private String houseNo;
    private String streetName;
    private String postcode;
    private List<Occupant> occupants;
    private List<Room> rooms;

    public House(String houseNo, String streetName, String postcode) {
        this.houseNo = houseNo;
        this.streetName = streetName;
        this.postcode = postcode;
        this.occupants = new ArrayList<>();
        this.rooms = new ArrayList<>();
    }

    public void addOccupant(Occupant occupant) {
        occupants.add(occupant);
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void printHousehold() {
        System.out.println("House: " + houseNo + ", " + streetName + ", " + postcode);

        System.out.println("\nOccupants:");
        for (Occupant o : occupants) {
            System.out.println(" - " + o.getDetails());
        }

        System.out.println("\nRooms:");
        for (Room r : rooms) {
            System.out.println(" - " + r.getDetails());
        }
    }

    // MAIN method inside House class
    public static void main(String[] args) {
        House myHouse = new House("12", "Oak Street", "ML1 4AB");

        // Add occupants
        myHouse.addOccupant(new Adult("John", 40, "SY757001D", "Engineer"));
        myHouse.addOccupant(new Adult("Emma", 38, "SZ700101A", "Teacher"));
        myHouse.addOccupant(new Child("Sophia", 10, "Greenwood Primary"));
        myHouse.addOccupant(new Pet("Buddy", 3, "Dog"));

        // Add rooms
        myHouse.addRoom(new LivingRoom(2, 20.5));
        myHouse.addRoom(new Kitchen(1, 15.0));
        myHouse.addRoom(new BathRoom(1, 8.0));
        myHouse.addRoom(new BedRoom1(2, 18.0));
        myHouse.addRoom(new BedRoom2(1, 16.5));

        // Print household details
        myHouse.printHousehold();
    }
}
