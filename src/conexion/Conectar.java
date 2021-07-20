package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conectar {

    Statement st;

    public Conectar() {
        Connection con;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/inventario-system", "root", "1234");
            st = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public boolean update(String update) {
        try {
            st.execute(update);
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return false;

    }
    
    public ResultSet consulSet(String consult){
        try {
            return st.executeQuery(consult);
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "error \n\n"+ex);
        }
        return null;
    }
    
    public void close(){
        try {
            st.close();
        } catch (Exception ex) {
        }
        
    }

    //delete,insert,drop,update
    
   /* public boolean Actualizar(String sql){
        try {
            st.executeQuery(sql);
            JOptionPane.showMessageDialog(null, "Hecho!");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //select from, where consultas
    
    public ResultSet Consultar(String sql){
        try {
            return st.executeQuery(sql);                                
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void Cerrar(){
        try {
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
}
