package House.Occupant;

public class Pet extends Occupant {
    private String species;

    public Pet(String name, int age, String species) {
        super(name, age);
        this.species = species;
    }

    @Override
    public String getDetails() {
        return "Pet: " + name + ", Age: " + age + ", Species: " + species;
    }
}
