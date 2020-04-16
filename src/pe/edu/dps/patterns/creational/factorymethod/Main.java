package pe.edu.dps.patterns.creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Method");

        Vehiculo vehiculo = Creator.factoryMethod(6000);

        vehiculo.encender();
        vehiculo.acelerar();
        vehiculo.girar();
        vehiculo.frenar();

        Vehiculo vehiculo2 = Creator.factoryMethod(12000);

        vehiculo2.encender();
        vehiculo2.acelerar();
        vehiculo2.girar();
        vehiculo2.frenar();


    }
}
