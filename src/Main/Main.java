package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Main {

	public static void main(String[] args) throws SQLException {
		Main main = new Main();
		main.Database();
		
	}
	
	public void Database() throws SQLException {
		final String DSN = "jdbc:postgresql://localhost:5432/Progii?ssl=false";
		Connection conn;
		conn = DriverManager.getConnection(DSN, "postgres", "Paulo2002");
	}

}