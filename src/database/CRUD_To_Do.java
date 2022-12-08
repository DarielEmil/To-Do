
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class CRUD_To_Do {
    conexionDB cnx = new conexionDB();
    Connection cn = cnx.conexion();
    loginDB log = new loginDB();
    public void agregar();
    
    public static void main(String[] args){
        
    };



