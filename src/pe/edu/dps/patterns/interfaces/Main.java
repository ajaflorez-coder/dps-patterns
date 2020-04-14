package pe.edu.dps.patterns.interfaces;

public class Main {
    public static void main(String args[]) {
        System.out.println("Probando Perro");

        Perro perro = new Perro();
        Pollo pollo = new Pollo();
        Zapato zapato = new Zapato();

        perro.comer(zapato);
        perro.comer(pollo);

    }


}
