package pe.edu.dps.patterns.structural.proxy2;

public class ProxyPatternDemo {
    public static void main(String args[]) {
        Image image = new ProxyImage("test_10mb.jpg");

        image.display();
        image.display();

    }
}
