/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package db;
import java.sql.* ;

/**
 *
 * @author Zribi
 */
public class Connection {
  public static Connection getCon(){
        String url="jdbc:mysql://localhost:3306/project?useSSL=true";
        String user ="root";
        String pass="";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection(url,user,pass);
            System.out.println("Success");
            return con ; 
            
        }
        catch(Exception e){
            System.out.println("fail");
            return null ; 
        }
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

