/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boston.employeemanagement;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Future CEO
 */
/**
 *
 * @author Zuko
 */
public class DB_Connection {
    public static void main(String[] args) {
		DB_Connection obj_DB_Connection=new DB_Connection();
		
		System.out.print(obj_DB_Connection.get_connection());
	}
    
    public Connection get_connection(){
		Connection connection=null;
		try {
			
		
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fa1","root", "Kwanelezukotola3");
 		
		} catch (Exception e) {
			System.out.println(e);
		}
		return connection;
    }
}
