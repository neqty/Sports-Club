import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SportsClub {

    private String clubName;
    private List<Athlete> athletes = new ArrayList<>();

    public SportsClub(String clubName) {
        this.clubName = clubName;
    }

    public void addAthlete(Athlete athlete) {
        athletes.add(athlete);
    }

    public List<Athlete> getAthletes() {
        return athletes;
    }

    @Override
    public String toString() {
        return "SportsClub{clubName='" + clubName + "', athletes=" + athletes + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SportsClub)) return false;
        SportsClub that = (SportsClub) o;
        return Objects.equals(clubName, that.clubName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clubName);
    }
}
