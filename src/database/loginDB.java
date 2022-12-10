
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;


class loginDB {
    conexionDB cnx = new conexionDB();
    Connection cn = cnx.conexion();
    public int login(String usuario, String clave){
        String SQL = "SELECT ID FROM usuario WHERE nombreUsuario = '%s' AND clave = '%s' ".formatted(usuario, clave);
        try{ 
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.getInt(1) >= 1){
                return rs.getInt(1);
            };
        }catch(SQLException e){
            System.out.println("Error al ingresarse %s".formatted(e));
            return 0;
        }finally{
            try{
                cn.close();
            }catch(SQLException e){
                System.out.println("Hubo un problema %s".formatted(e));
            }
        }
        return 0;
    };
//    public static void main(String[] args){
//        loginDB obj = new loginDB();
//        System.out.println(obj.login("Dariel", "123456"));
//    };
}
