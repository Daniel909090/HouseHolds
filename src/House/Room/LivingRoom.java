package House.Room;

public class LivingRoom extends Room {
    private double roomArea;

    public LivingRoom(int noOfWindows, double roomArea) {
        super("Living Room", noOfWindows);
        this.roomArea = roomArea;
    }

    @Override
    public String getDetails() {
        return "Living Room - Windows: " + noOfWindows + ", Area: " + roomArea + " sqm";
    }
}
