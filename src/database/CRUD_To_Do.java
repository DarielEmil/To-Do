
package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class CRUD_To_Do {
    conexionDB cnx = new conexionDB();
    
    public void agregar(int id, String tarea, String fechaInicio, String fechaFinal){
        Connection cn = cnx.conexion();
        String SQL = "INSERT INTO tareas(IDUsuario, nombreTarea, fechaCreacion,fechaFinalizacion)"
                + " VALUES (%s, '%s', '%s', '%s')".formatted(id, tarea, fechaInicio, fechaFinal);
        try{
            if (id >=1){
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
        cnx.cerrar();
    };
    public void eliminar(int id, String tarea){
        cnx.cerrar();
        Connection cn = cnx.conexion();
        String SQL = "DELETE FROM tareas WHERE IDUsuario = %s AND nombreTarea = '%s'".formatted(id, tarea);
        try{
            PreparedStatement st = cn.prepareStatement(SQL);
            int status = st.executeUpdate();
        }catch(SQLException e){
            System.out.println("Hubo un problema en actualizar los datos: %s".formatted(e));
            
        }
    };
    public void actualizar(int id, String tareaCambio){
        cnx.cerrar();
        Connection cn = cnx.conexion();
        String SQL = "UPDATE tareas SET nombreTarea = '%s' WHERE IDUsuario = %s".formatted(tareaCambio, id);
        try{
            PreparedStatement st = cn.prepareStatement(SQL);
            int status = st.executeUpdate();
            
        }catch (SQLException e){
            System.out.println("Hubo un problema al actualizar: %s".formatted(e));
        };
    };
//    public static void main(String[] args){
//        CRUD_To_Do obj = new CRUD_To_Do();
//        obj.agregar(1, "Prueba", "2022", "2023");
//    }
}


