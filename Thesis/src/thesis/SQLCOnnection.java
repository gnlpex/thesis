/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thesis;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Jude
 */
public class SQLCOnnection {
    Connection conn=null;
public static Connection ConnecrDb(){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","");
JOptionPane.showMessageDialog(null, "Database Connected");
return conn;
}catch(Exception e){
JOptionPane.showMessageDialog(null, "Database Connection Failed");

return null;
}
}

}
