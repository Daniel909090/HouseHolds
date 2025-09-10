package House.Room;

public class Kitchen extends Room {
    private double roomArea;

    public Kitchen(int noOfWindows, double roomArea) {
        super("Kitchen", noOfWindows);
        this.roomArea = roomArea;
    }

    @Override
    public String getDetails() {
        return "Kitchen - Windows: " + noOfWindows + ", Area: " + roomArea + " sqm";
    }
}
