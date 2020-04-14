package pe.edu.dps.patterns.creational.builder;

public interface IBuilder {
    void buildBody();
    void insertWheels();
    void addHeadlights();
    Product getVehicle();
}
