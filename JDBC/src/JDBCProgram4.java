//import java.sql package
import java.sql.*;
public class JDBCProgram4 {

	public static void main(String[] args) {
		//DELETE QUERRY USING JDBC.
		//url, username and password for connecting with DB
				String url = "jdbc:mysql://localhost:3305/myjdbcdb";
				String username ="root";
				String password ="Root";
				//query to be executed
				String query = "DELETE FROM STUDENT WHERE ROLL=3";
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.println("Driver loaded successfully");
					//Establish the Connection 
					Connection con = DriverManager.getConnection(url,username,password);
					System.out.println("Connection is established");
					//Creating the Statement
					Statement stmt = con.createStatement();
					//Executing the query
					stmt.executeUpdate(query);
					System.out.println("Query is executed");
				}
				catch(Exception e){
					e.printStackTrace();
				}


	}

}
