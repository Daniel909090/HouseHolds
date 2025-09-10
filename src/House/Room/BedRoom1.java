package House.Room;

public class BedRoom1 extends Room {
    private double roomArea;

    public BedRoom1(int noOfWindows, double roomArea) {
        super("BedRoom1", noOfWindows);
        this.roomArea = roomArea;
    }

    @Override
    public String getDetails() {
        return "BedRoom1 - Windows: " + noOfWindows + ", Area: " + roomArea + " sqm";
    }
}
