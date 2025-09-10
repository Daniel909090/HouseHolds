package House.Room;

public class BathRoom extends Room {
    private double roomArea;

    public BathRoom(int noOfWindows, double roomArea) {
        super("Bathroom", noOfWindows);
        this.roomArea = roomArea;
    }

    @Override
    public String getDetails() {
        return "Bathroom - Windows: " + noOfWindows + ", Area: " + roomArea + " sqm";
    }
}
