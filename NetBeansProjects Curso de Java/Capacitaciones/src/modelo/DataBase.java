package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DataBase {
    public static void main(String[] args) {
        try {
          
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1/capacitaciones","root","1234");
            
                System.out.println("exito");
            
                Statement s = c.createStatement();
                
                
                ResultSet res = s.executeQuery("select * from capacitaciones");
                //while(res.next()) {
                    
                    //System.out.print(res.getString("id_bicicleteria"));
                    //System.out.println("\r");
               // }
                    
                
               // int res = s.executeUpdate("insert into bicicleteria values (3,0,0)");
               // System.out.println("Retrono: "+res); 
                
        } catch (Exception e) {
            System.out.println("no pudo conectarse");
        }
    }
}
    


    
