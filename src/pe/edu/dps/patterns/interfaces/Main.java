package pe.edu.dps.patterns.interfaces;

public class Main {
    public static void main(String args[]) {
        System.out.println("Probando Perro");

        Perro perro = new Perro();
        Pollo pollo = new Pollo();
        Zapato zapato = new Zapato();
        Jugo jugo = new Jugo();
        Piedra piedra = new Piedra();
        Carne jurel = new Pescado();

        perro.comer(zapato);
        perro.comer(pollo);
        perro.comer(jugo);
        perro.comer(piedra);
        perro.comer(jurel);

    }


}
