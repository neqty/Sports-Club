public class SportsClub {

    String clubName;
    String sportType;
    Athlete athlete;

    public SportsClub(String clubName, String sportType, Athlete athlete) {
        this.clubName = clubName;
        this.sportType = sportType;
        this.athlete = athlete;
    }

    void showInfo() {
        System.out.println("Club name: " + clubName);
        System.out.println("Sport type: " + sportType);
        athlete.showInfo();
    }
}