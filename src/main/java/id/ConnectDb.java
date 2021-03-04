package id;

import java.sql.Connection;

public class ConnectDb {
    private static ConnectDb instance;
    private static Connection con;
    

    public ConnectDb() {
        
    }

    public static ConnectDb getInstance(){
        if(instance == null){
            System.out.println("Se crea la instancia");
            instance = new ConnectDb();
        }
        return instance;
    }

    public static Connection getCon() {
        return con;
    }
    public static void setCon(Connection con) {
        ConnectDb.con = con;
    }
}
