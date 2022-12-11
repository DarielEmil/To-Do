
package database;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class CRUD_To_Do {
    conexionDB cnx = new conexionDB();

    public void agregarU(int id, String tarea, String fechaInicio, String fechaFinal){
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
                JOptionPane.showMessageDialog( null,"Tiene otra tarea con ese nombre, cambie el nombre de la tarea o elimine la anterior.");
                System.out.println("Tiene otra tarea con ese nombre, cambie el nombre de la tarea o elimine la anterior.");
            }else{
                System.out.println("Hubo un problema al ingresar los datos: %s".formatted(e));
            };
        }
        cnx.cerrar();
    };
    public void eliminarU(int id, String tarea){
        cnx.cerrar();
        Connection cn = cnx.conexion();
        String SQL = "DELETE FROM tareas WHERE IDUsuario = %s AND nombreTarea = '%s'".formatted(id, tarea);
        try{
            PreparedStatement st = cn.prepareStatement(SQL);
            int status = st.executeUpdate();
            JOptionPane.showMessageDialog( null,"Se eliminó correctamente ");
        }catch(SQLException e){
            JOptionPane.showMessageDialog( null,"No existen mas filas para eliminar");
            System.out.println("Hubo un problema en actualizar los datos: %s".formatted(e));
            
        }
    };
        public void completado(int id, String tarea){
        cnx.cerrar();
        Connection cn = cnx.conexion();
        String SQL = "DELETE FROM tareas WHERE IDUsuario = %s AND nombreTarea = '%s'".formatted(id, tarea);
        try{
            PreparedStatement st = cn.prepareStatement(SQL);
            int status = st.executeUpdate();
            JOptionPane.showMessageDialog( null,"Felicidades! Ha completado exitosamente su tarea :D");
        }catch(SQLException e){
            JOptionPane.showMessageDialog( null,"Hubo un problema en completar la tarea");
            System.out.println("Hubo un problema en completar la peticion %s".formatted(e));
            
        }
    };
    public void actualizarU(int id, String tareaCambio, String tareaAnterior){
        cnx.cerrar();
        Connection cn = cnx.conexion();
        String SQL = "UPDATE tareas SET nombreTarea = '%s' WHERE IDUsuario = %s AND nombreTarea = '%s' ".formatted(tareaCambio, id, tareaAnterior);
        try{
            PreparedStatement st = cn.prepareStatement(SQL);
            int status = st.executeUpdate();
            JOptionPane.showMessageDialog( null,"Se actualizó correctamente ");
            
        }catch (SQLException e){
            System.out.println("Hubo un problema al actualizar: %s".formatted(e));
        };
    };
    
        public void agregarA(int id, String nombreUsuario, String clave, String correo){
        Connection cn = cnx.conexion();
        String SQL = "INSERT INTO usuario(nombreUsuario, clave, correo)"
                + " VALUES ('%s', '%s', '%s')".formatted(nombreUsuario,clave, correo );
        try{
            if (id >=1){
                PreparedStatement st = cn.prepareStatement(SQL);
                st.executeUpdate();
        }
        }catch(SQLException e){
            if (e.getErrorCode() == 19){
                JOptionPane.showMessageDialog( null,"Tiene otra tarea con ese nombre, cambie el nombre de la tarea o elimine la anterior.");
                System.out.println("Tiene otra tarea con ese nombre, cambie el nombre de la tarea o elimine la anterior.");
            }else{
                System.out.println("Hubo un problema al ingresar los datos: %s".formatted(e));
            };
        }
        cnx.cerrar();
    };
    public void eliminarA(int id){
        cnx.cerrar();
        Connection cn = cnx.conexion();
        String SQLUser = "DELETE FROM usuario WHERE ID = %s;".formatted(id);
        String SQLTarea ="DELETE FROM tareas WHERE IDUsuario = %s;".formatted(id);
        try{
            PreparedStatement st = cn.prepareStatement(SQLUser);
            int status = st.executeUpdate();
            JOptionPane.showMessageDialog( null,"Se eliminó correctamente ");
        }catch(SQLException e){
            JOptionPane.showMessageDialog( null,"No existen mas filas para eliminar");
            System.out.println("Hubo un problema en actualizar los datos: %s".formatted(e));
        }
        try{
            PreparedStatement st = cn.prepareStatement(SQLTarea);
            int status = st.executeUpdate();
            JOptionPane.showMessageDialog( null,"Se eliminó correctamente ");
        }catch(SQLException e){
            System.out.println("Hubo un problema en actualizar los datos: %s".formatted(e));
        }
    };

    public void actualizarA(int id, String nombreUsuario){
        cnx.cerrar();
        Connection cn = cnx.conexion();
        String SQL = "UPDATE usuario SET nombreUsuario = '%s' WHERE ID = %s".formatted(nombreUsuario, id);
        try{
            PreparedStatement st = cn.prepareStatement(SQL);
            int status = st.executeUpdate();
            JOptionPane.showMessageDialog( null,"Se actualizó correctamente ");
            
        }catch (SQLException e){
            System.out.println("Hubo un problema al actualizar: %s".formatted(e));
        };
    };
    
//    public static void main(String[] args){
//        CRUD_To_Do obj = new CRUD_To_Do();
//        obj.agregar(1, "Prueba", "2022", "2023");
//    }
}


