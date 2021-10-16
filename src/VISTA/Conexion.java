package VISTA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection getConnection(){
        String connectionURL = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;" 
                + "databaseName=Clientes_nomina;" 
                + "user = sa;" 
                + "password =Dsñ2021-2;";
        
        try{
            Connection con = DriverManager.getConnection(connectionURL);
            return con;
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
}
