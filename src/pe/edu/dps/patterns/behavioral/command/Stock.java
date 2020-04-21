package pe.edu.dps.patterns.behavioral.command;

public class Stock {
    private String name;
    private int quantity;

    public Stock() {
        this.name = "ABC";
        this.quantity = 10;
    }
    public void buy() {
        System.out.println("Stock [Name: " + name + ", Quantity: " + quantity + "] bought");
    }
    public void sell() {
        System.out.println("Stock [Name: " + name + ", Quantity: " + quantity + "] sold");
    }
}
