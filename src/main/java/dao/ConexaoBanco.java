package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConexaoBanco {
    
    private static final String DRIVER_CLASS = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/saam";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "postgres";

    
    public static Connection abreConexao(){
        Connection con = null;

        try {
            Class.forName(DRIVER_CLASS);
            //con = DriverManager.getConnection();
            con = DriverManager.getConnection(URL, USUARIO, SENHA);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com banco de dados " + e);
        }

        
        
        return con;
    }     
}
