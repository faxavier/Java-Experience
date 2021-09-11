/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asmyproject;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Xavier de Jesus
 */
public class Myconnectivity {

    Connection connect(){
       
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/couriers","root","");
            JOptionPane.showMessageDialog(null, "successful connected");
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
     return null;
    }
}
