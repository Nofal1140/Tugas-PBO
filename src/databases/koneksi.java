/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databases;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class koneksi {
    
    public Connection konek;
    public koneksi(){
       
        try {
            String database="2110010052";
            String username="root";
            String password="";
            String URL="jdbc:mysql://localhost/"+database;
            
            Class.forName("com.mysql.jdbc.Driver");
            konek =  DriverManager.getConnection(URL,username,password);
            System.out.print("Databases Berhasil di Koneksikan");
        } catch (Exception e) {
            System.out.print(toString());
        }
        }
    
}
