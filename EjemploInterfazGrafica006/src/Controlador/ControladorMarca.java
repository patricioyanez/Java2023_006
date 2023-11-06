
package Controlador;

import Modelo.Marca;
import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


public class ControladorMarca {
    public boolean agregar(Marca marca)
    {
        try{
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "INSERT INTO MARCA (NOMBRE, HABILITADO) VALUES (?,?)";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setString(1, marca.getNombre());
            st.setBoolean(2, marca.getHabilitado());
            
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch(SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    public boolean actualizar(Marca marca)
    {
        return true;
    }
    public boolean eliminar(int id)
    {
        return true;
    }
    
    public ArrayList<Marca> listarTodos()
    {
        return null;
    }
    
    public Marca buscarPorId(int id)
    {
        return null;
    }
}
