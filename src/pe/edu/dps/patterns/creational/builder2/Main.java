package pe.edu.dps.patterns.creational.builder2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Buider user");

        User user = new UserBuilder().age(18).familyName("Flores").build();



    }
}
