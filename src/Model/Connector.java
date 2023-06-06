/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;
import javax.swing.JOptionPane;

public class Connector {
    String DBurl="jdbc:mysql://localhost/almaul";
    String DBusername="root";
    String DBpassword="";
    Connection con;
    Statement stt;

    public Connector() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(DBurl, DBusername, DBpassword);
//            System.out.println("Succes");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
