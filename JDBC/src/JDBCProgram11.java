import java.sql.*;
import java.util.Scanner;
public class JDBCProgram11 {

	public static void main(String[] args) {
		// Taking no. of rows from the user input and.. 
		//To take the user input for all patients and insert them into the table 
		String url ="jdbc:mysql://localhost:3305/myjdbcdb";
		String username ="root";
		String password = "Root";
		//query to be executed 
		String query = "INSERT INTO HOSPITAL VALUES(?,?,?)";
		try {
			//establishing the connection
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established");
			//Preparing the statement for executing the query with placeholders
			PreparedStatement pstmt = con.prepareStatement(query);
			//Taking user input for number of rows to be inserted
			Scanner scan = new Scanner(System.in);
			System.out.println("How many rows to be inserted?");
			int rows = scan.nextInt();
			//Taking user input, completing the query and executing the query..
			for(int i=1; i<=rows;i++) {
			System.out.println("Enter patient id");
			int p_id = scan.nextInt();
			System.out.println("Enter patient name");
			String p_name = scan.next();
			System.out.println("Enter patient age");
			int p_age = scan.nextInt();
			pstmt.setInt(1, p_id);
			pstmt.setString(2, p_name);
			pstmt.setInt(3, p_age);
			pstmt.execute();
			}
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
