package ventadenotebooks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDatos {
    

    public static void main(String[] args) throws SQLException {
   
        try{
          
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1/vta_notebook","root","1234");
            
               System.out.println("exito");
                
           //Consultar Tabla
          //  Statement consul1 = c.createStatement(); 
          /*
            ResultSet rdo = consul1.executeQuery("select* from notebok");
            while(rdo.next()) {
                    
                    System.out.print(rdo.getString("idNotebook"));
                    System.out.println("\\");
                    System.out.print(rdo.getString("marca"));
                    System.out.println("\t");
                    System.out.print(rdo.getString("modelo"));
                    System.out.println("\t");
                    System.out.print(rdo.getString("procesador"));
                    System.out.println("\t");
                    
                }
            
            //Agregar 
            //Statement consul2 = c.createStatement();
            //.executeQuery("select* from cliente");
            //int rdo2 = consul2.executeUpdate("insert into CLIENTE values (24012767,Pepe,Lorenzo, Cornalitos 1023)");
             //  System.out.println("Retorno: "+rdo2); // Nos deberia retornar 1 indicando que la columna se agrego
        
        */
        } catch (Exception e) {
            System.out.println("no pudo conectarse");
        }
            
            
            
            
}
}