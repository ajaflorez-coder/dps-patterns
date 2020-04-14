package pe.edu.dps.patterns.creational.factorymethod;

public class Car implements Vehiculo {
    @Override
    public void encender() {
        System.out.println("Introduce la llave y gira");
    }

    @Override
    public void acelerar() {
        System.out.println("Presione el pedal del acelerador");
    }

    @Override
    public void frenar() {
        System.out.println("Presiona el pedal del freno");
    }

    @Override
    public void girar() {
        System.out.println("Gira el Timon");
    }
}
