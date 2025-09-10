package House.Occupant;

public class Child extends Occupant {
    private String school;

    public Child(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    @Override
    public String getDetails() {
        return "Child: " + name + ", Age: " + age + ", School: " + school;
    }
}
