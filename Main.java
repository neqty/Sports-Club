import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        FootballClub club = new FootballClub("Astana Sports Club");

        Athlete a1 = new Athlete("Ali", 20, "Football");
        Athlete a2 = new Athlete("Arman", 17, "Football");
        Athlete a3 = new Athlete("Dias", 22, "Football");

        club.addAthlete(a1);
        club.addAthlete(a2);
        club.addAthlete(a3);

        // 🔹 Polymorphism
        Person p = new Athlete("Nursultan", 19, "Football");
        System.out.println(p);

        // 🔹 Searching
        System.out.println("Searching athlete named Ali:");
        for (Athlete a : club.getAthletes()) {
            if (a.getName().equals("Ali")) {
                System.out.println(a);
            }
        }

        // 🔹 Filtering
        System.out.println("Athletes older than 18:");
        club.getAthletes().stream()
                .filter(a -> a.getAge() > 18)
                .forEach(System.out::println);

        // 🔹 Sorting
        System.out.println("Sorted athletes by name:");
        club.getAthletes().sort(Comparator.comparing(Athlete::getName));
        club.getAthletes().forEach(System.out::println);
    }
}
