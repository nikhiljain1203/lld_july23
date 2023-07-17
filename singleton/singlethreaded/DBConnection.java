package singleton.singlethreaded;

public class DBConnection {
    private static DBConnection instance = null;

    private DBConnection(){};

    public static DBConnection getInstance() {
        if(instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

}
