package pe.edu.dps.patterns.behavioral.chain;

public class ConsoleLogger extends AbstractLogger{
    public ConsoleLogger( int level ) {
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
