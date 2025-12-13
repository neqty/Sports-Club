public class Athlete {

    String name;
    int age;
    String position;

    public Athlete(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    void showInfo() {
        System.out.println("Athlete name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
    }
}