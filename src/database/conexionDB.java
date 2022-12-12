package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conexionDB {
    public Connection conexion(){
        Connection cn = null;
        try{
            cn = DriverManager.getConnection("jdbc:sqlite:ToDoDB");
        }
        catch(SQLException e){
            System.out.println("Hubo algun error: %s".formatted(e));
        }
        return cn;
    };
    public void cerrar(){
        conexionDB cnx = new conexionDB();
        try{
            cnx.conexion().close();
        }catch(SQLException e){
                System.out.println("Error al cerrar la conexion: %s".formatted(e));            
            }
       }
}


