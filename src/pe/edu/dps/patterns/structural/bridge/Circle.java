package pe.edu.dps.patterns.structural.bridge;

public class Circle extends Shape {
    private int radius;
    private int x;
    private int y;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
