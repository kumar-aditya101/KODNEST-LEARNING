//import java.sql package
import java.sql.*;
public class JDBCProgram5 {

	public static void main(String[] args) {
		//FETCHING THE DATA QUERRY USING JDBC.
		//url, username and password for connecting with DB
		String url = "jdbc:mysql://localhost:3305/myjdbcdb";
		String username ="root";
		String password ="Root";
		//query to be executed
		String query = "SELECT * FROM STUDENT";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			//Establish the Connection 
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established");
			//Creating the Statement
			Statement stmt = con.createStatement();
			//Executing the query and getting the Result Set
			ResultSet rs = stmt.executeQuery(query);
			//Fetching the data using resultSet
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
