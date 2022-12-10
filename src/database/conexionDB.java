package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conexionDB {
    Connection cn;
    public Connection conexion(){

        try{
            cn = DriverManager.getConnection("jdbc:sqlite:ToDoDB");
        }
        catch(SQLException e){
            System.out.println("Hubo algun error: %s".formatted(e));
        }
        return cn;
    };
//    public static void main(String[] args){
//        conexionDB obj = new conexionDB();
//        obj.conexion();
//    };
}


