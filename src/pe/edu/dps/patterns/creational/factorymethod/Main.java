package pe.edu.dps.patterns.creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Method");

        Vehiculo vehiculo = Creator.factoryMethod(2000);

        vehiculo.encender();
        vehiculo.acelerar();
        vehiculo.girar();
        vehiculo.frenar();
    }
}
