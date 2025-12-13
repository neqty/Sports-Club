public class Main {
    public static void main(String[] args) {

        Athlete athlete = new Athlete(
                "Cristiano Ronaldo",
                38,
                "Forward"
        );

        FootballClub club = new FootballClub(
                "Al Nassr",
                "Football",
                athlete,
                9
        );

        club.showInfo();
    }
}
