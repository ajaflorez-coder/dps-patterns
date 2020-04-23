package pe.edu.dps.patterns.behavioral.observer;

public class MyScoreDisplay  implements Observer{
    @Override
    public void update(int runs, int wickets, float overs) {
        display();
    }

    public void display() {
        System.out.println("\nEste es mi Observer");
    }
}
