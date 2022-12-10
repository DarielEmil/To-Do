
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
    int verify = log.login("Dariel", "123456");
    public void agregar(String tarea, String fecha){
        String SQL = "INSERT INTO tareas(IDUsuario, nombreTarea, fechaCreacion,fechaFinalizacion)"
                + " VALUES (%s, '%s', date(), '%s')".formatted(verify, tarea, fecha);
        try{
            if (verify >=1){
                PreparedStatement st = cn.prepareStatement(SQL);
                st.executeUpdate();
        }
        }catch(SQLException e){
            if (e.getErrorCode() == 19){
                System.out.println("Tiene otra tarea con ese nombre, cambie el nombre de la tarea o elimine la anterior.");
            }else{
                System.out.println("Hubo un problema al ingresar los datos: %s".formatted(e));
            };
        }
    };
    public void eliminar(String tarea){
        String SQL = "DELETE FROM tareas WHERE IDUsuario = %s AND nombreTarea = '%s'".formatted(verify, tarea);
        try{
            PreparedStatement st = cn.prepareStatement(SQL);
            int status = st.executeUpdate();
           
        }catch(SQLException e){
            System.out.println("Hubo un problema en actualizar los datos: %s".formatted(e));
            
        }
    };
    public void actualizar(String tareaCambio){
        String SQL = "UPDATE tareas SET nombreTarea = '%s' WHERE IDUsuario = %s".formatted(tareaCambio, verify);
        try{
            PreparedStatement st = cn.prepareStatement(SQL);
            int status = st.executeUpdate();
            
        }catch (SQLException e){
        
        };
    };
    public static void main(String[] args){
        CRUD_To_Do obj = new CRUD_To_Do();
        obj.agregar("Pruebaa", "2022/04/13");
//          obj.eliminar("Prueba");
//        obj.actualizar("Cambio de tarea");
    };
}


