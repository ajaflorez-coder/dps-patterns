package pe.edu.dps.patterns.creational.factorymethod;

public class Bici implements Vehiculo{
    @Override
    public void encender() {
        System.out.println("Las Bicis no tienen motor");
    }

    @Override
    public void acelerar() {
        System.out.println("Pedalea fuerte");
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
