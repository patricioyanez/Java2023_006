
package Controlador;

import Modelo.Marca;
import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        try{
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "UPDATE MARCA SET NOMBRE=?, HABILITADO=? WHERE ID=?";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setString(1, marca.getNombre());
            st.setBoolean(2, marca.getHabilitado());
            st.setInt(3, marca.getId());
            
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch(SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    public boolean eliminar(int id)
    {
        try{
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "DELETE FROM MARCA WHERE ID=?";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setInt(1, id);
            
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch(SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    
    public Marca buscarPorId(int id)
    {
        try{
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT ID, NOMBRE, HABILITADO FROM MARCA WHERE ID=?";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setInt(1, id);            
            
            ResultSet rs = st.executeQuery();
            
            if(rs.next())
            {
                Marca marca = new Marca();
                marca.setId(rs.getInt("ID"));
                marca.setNombre(rs.getString("NOMBRE"));
                marca.setHabilitado(rs.getBoolean("HABILITADO"));
                return marca;
            }
            
            st.close();
            cx.close();
            return null;
        } catch(SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }
    public ArrayList<Marca> listarTodos()
    {
        return null;
    }
    
}
