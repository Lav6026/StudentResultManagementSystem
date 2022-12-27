/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connectionprovider;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author soul
 */
public class Connectionprovidercode {
    public static Connection getcon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://your mysql table url","your mysql username","your mysql password");
            return con;
        }
        catch (Exception e){
            
            JOptionPane.showMessageDialog(null, e.toString());
            return null;  
        }
        
    }
    public static void main(String args[]){
        Connectionprovidercode con =new Connectionprovidercode();
        Connection c=con.getcon();
    }
    
}
