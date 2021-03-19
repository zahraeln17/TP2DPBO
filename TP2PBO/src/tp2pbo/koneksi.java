package tp2pbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 
public class koneksi {
    public static Connection con;
    public static Statement stm;
    public static void main(String args[]){
        try {
            String url ="http://localhost/phpmyadmin/db_structure.php?server=1&db=tp2pbo";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("koneksi berhasil;");
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
    }
    
}
