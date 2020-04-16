package pe.edu.dps.patterns.creational.factorymethod;

public class Motorcicle implements Vehiculo{
    @Override
    public void encender() {
        System.out.println("Introduce la llave y gira");
    }

    @Override
    public void acelerar() {
        System.out.println("Gira el acelerador");
    }

    @Override
    public void frenar() {
        System.out.println("Presiona el freno trasero");
    }

    @Override
    public void girar() {
        System.out.println("Usa el manubrio");
    }
}
