package pe.edu.dps.patterns.creational.builder3;

import pe.edu.dps.common.Showcase;

public class BuilderShowcase implements Showcase {

    @Override
    public void show() {
        System.out.println("Builder Pattern Showcase");
        User john = new User.Builder()
                .withFirstName("John")
                .withLastName("Doe")
                .withAge(25)
                .withAddress("Nowhere")
                .withPhone("990000000")
                .build();

        User bruce = new User.Builder()
                .withFirstName("Bruce")
                .withLastName("Wayne")
                .withAge(45)
                .build();
        System.out.println(john);
        System.out.println(bruce);

    }
}
