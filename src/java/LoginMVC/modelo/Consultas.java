/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginMVC.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author gamecore
 */
public class Consultas extends Conexion{
    
    public boolean Authenticacion (String user, String pass) throws SQLException{
    
        Statement st = con.createStatement();
        ResultSet rs = null;
        String consulta = "Select * from Usuario";
        rs = st.executeQuery(consulta);
        
        while(rs.next()){
        
            if( user.equals(rs.getString("Usuario")) && pass.equals(rs.getString("Contraseña"))  )
                return true;
        }
        return false;
    
    }
    
    /*
    
    test de la autenticacion
    
    public static void main(String[] args) throws SQLException {
        Consultas consulta = new Consultas();
        System.out.println(consulta.Authenticacion("karlita", "teamo"));
        
    }*/
    
}
