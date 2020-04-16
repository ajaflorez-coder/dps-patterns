package pe.edu.dps.patterns.creational.factorymethod;

public class Creator {

    public static Vehiculo factoryMethod(int dinero) {
        Vehiculo vehiculo = null;
        if(dinero > 10000) {
            vehiculo = new Car();
        }
        else if(dinero <= 10000 && dinero > 3000) {
            vehiculo = new Motorcicle();
        }
        else {
            vehiculo = new Bici();
        }

        return vehiculo;
    }
}
