/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cepcombanco.database;

import com.mycompany.cepcombanco.model.User;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author FRELIANNYSISMELIALOP
 */
public class CrearteTable {
     public static void createTable(Connection connection){
   String sql = "CREATE TABLE IF NOT EXISTS tasks("
                + "id int AUTO_INCREMENT PRIMARY KEY ,"
                + "email VARCHAR(100) NOT NULL,"
                + "cep INT NOT NULL )";
             
    
    
    try(Statement stmt = connection.createStatement()){
    stmt.execute(sql);
    
   }catch(SQLException e){
    System.out.println("Erron in table creation"+ e.getLocalizedMessage());

}
    
    } 
/*
     public static User verificarUsuario(String email, char[] charPassword){
       String password = new String(charPassword);
       User user = new User(email,password);
       if(usuarioDAO.validarLogin(user) == true){
       
           return user;
       }else{
       
       }return null;
   }*/
}




