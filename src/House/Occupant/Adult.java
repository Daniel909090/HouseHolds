package House.Occupant;

public class Adult extends Occupant {
    private String nino;
    private String occupation;

    public Adult(String name, int age, String nino, String occupation) {
        super(name, age);
        this.nino = nino;
        this.occupation = occupation;
    }

    @Override
    public String getDetails() {
        return "Adult: " + name + ", Age: " + age + ", NINo: " + nino + ", Occupation: " + occupation;
    }
}
