package House.Room;

public abstract class Room {
    protected String roomType;
    protected int noOfWindows;

    public Room(String roomType, int noOfWindows) {
        this.roomType = roomType;
        this.noOfWindows = noOfWindows;
    }

    public abstract String getDetails();
}
