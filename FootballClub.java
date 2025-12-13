public class FootballClub extends SportsClub{
    int trophies;

    public FootballClub(String clubName, String sportType,
                        Athlete athlete, int trophies) {
        super(clubName, sportType, athlete);
        this.trophies = trophies;
    }

    void showInfo() {
        System.out.println("Football Club: " + clubName);
        System.out.println("Sport type: " + sportType);
        System.out.println("Trophies: " + trophies);
        athlete.showInfo();
    }
}
