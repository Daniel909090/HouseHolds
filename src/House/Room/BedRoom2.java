package House.Room;

public class BedRoom2 extends Room {
    private double roomArea;

    public BedRoom2(int noOfWindows, double roomArea) {
        super("BedRoom2", noOfWindows);
        this.roomArea = roomArea;
    }

    @Override
    public String getDetails() {
        return  "BedRoom2 - Windows: " + noOfWindows + ", Area: " + roomArea + " sqm";
    }
}
