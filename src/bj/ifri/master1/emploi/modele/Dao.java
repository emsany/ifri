/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.ifri.master1.emploi.modele;

import bj.ifri.master1.emploi.utils.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SANNI Emmanuel
 */
public class Dao {
    
    protected static Connection connection;
    
    protected List<Dao> list(){
        return null;
    }
    public static boolean Connect(){
        

        try {
            if (connection != null && connection.isValid(1000) )  return true;
            Properties connectionProps = new Properties();
            connectionProps.put("user", Config.DATABASE_USER_NAME);
            connectionProps.put("password", Config.DATABASE_USER_PASSWORD);
            connection = DriverManager.getConnection("jdbc:postgresql://" + Config.DATABASE_SERVER_ADDRESS + ":" + Config.DATABASE_SERVER_PORT + "/" +  Config.DATABASE_NAME, connectionProps);
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        System.out.println("Connected to database");
        return true;
    }

    public static Connection getConnection() {
        return connection;
    }

    public static void setConnection(Connection connection) {
        Dao.connection = connection;
    }
    
    
    
}
