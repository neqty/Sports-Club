import java.util.Objects;

public class Athlete extends Person {

    private String sport;

    public Athlete(String name, int age, String sport) {
        super(name, age);
        this.sport = sport;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "Athlete{name='" + name + "', age=" + age + ", sport='" + sport + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Athlete)) return false;
        Athlete athlete = (Athlete) o;
        return age == athlete.age &&
                Objects.equals(name, athlete.name) &&
                Objects.equals(sport, athlete.sport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sport);
    }
}
