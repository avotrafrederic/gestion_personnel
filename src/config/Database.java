/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

/**
 *
 * @author zandry_kely
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Database {
    
    private Connection connexion = null;

    public Database() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            this.connexion = DriverManager.getConnection("jdbc:mysql://localhost/gestion_personnel", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getConnexion(){
        return this.connexion;
    }
    
    
    
}
