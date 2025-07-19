package CRUD_Veterinaria;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
    Connection con;
    public Connection Conectar(){
        String url="jdbc:mysql://localhost:3306/clinica_veterinaria";
        String user="root";
        String pass="";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa");
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
        return con;
    }
}
