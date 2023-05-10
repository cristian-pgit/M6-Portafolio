package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Singleton {
	// Propiedades
	private static Connection conn = null;
	// Constructor
	private Singleton(){
		String url = "jdbc:mysql://localhost:3306/vrolbd";
		String driver = "com.mysql.cj.jdbc.Driver";
		String usuario = "root";
		String password = "Larcon90";
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection
					(url, usuario, password);
		}
		catch (ClassNotFoundException
				| SQLException e){
			e.printStackTrace();
		}
	} // Fin constructor
	
	// Métodos
	public static Connection getConnection(){
		if (conn == null){
			new Singleton();
		}
		return conn;
	} 
	

	

}