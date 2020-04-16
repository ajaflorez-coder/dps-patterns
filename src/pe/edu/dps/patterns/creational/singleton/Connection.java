package pe.edu.dps.patterns.creational.singleton;

public class Connection {
    private String url;
    private String user;
    private String passwd;

    public static int contador = 0;
    private static Connection instance;

    private Connection() {
        contador++;
    }

    public static synchronized Connection getInstance() {
        if(instance == null) {
            instance = new Connection();
        }
        return instance;
    }
}
