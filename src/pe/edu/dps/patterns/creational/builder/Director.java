package pe.edu.dps.patterns.creational.builder;

public class Director {
    private IBuilder myBuilder;

    // A series of steps—for the production​
    public void construct(IBuilder builder) {
        this.myBuilder = builder;
        this.myBuilder.buildBody();
        this.myBuilder.insertWheels();
        this.myBuilder.addHeadlights();
    }
}
