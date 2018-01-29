/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ginel
 */import java.sql.*;
import javax.swing.*;
public class SQLConnection {
    Connection conn=null;
            
public static Connection ConnecrDb(){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");
return conn;
}catch(Exception e){


return null;
}
}

    
}
