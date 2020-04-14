package pe.edu.dps.patterns.creational.factorymethod;

public class Creator {

    public static Vehiculo factoryMethod(int dinero) {
        Vehiculo vehiculo = null;
        if(dinero > 10000)
            vehiculo = new Car();
        else
            vehiculo = new Bici();
        return vehiculo;
    }
}
