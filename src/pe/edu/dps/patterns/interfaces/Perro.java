package pe.edu.dps.patterns.interfaces;

public class Perro {
    private Estomago estomago;
    public Perro() {
        estomago = new Estomago();
    }
    public void comer(Alimento alimento) {
        estomago.recibir(alimento);
    }
    public void comer(Objeto objeto) {
        estomago.recibir(objeto);
    }
}
