package House.Occupant;

public abstract class Occupant {
    protected String name;
    protected int age;

    public Occupant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getDetails();
}
