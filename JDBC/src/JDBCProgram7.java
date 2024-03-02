import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCProgram7 {

	public static void main(String[] args) {
		// JDBC Program to Update the row in a table by taking the user input.
		String url = "jdbc:mysql://localhost:3305/myjdbcdb";
		String username ="root";
		String password ="Root";
		//query to be executed
		String query = "UPDATE EMPLOYEE SET emp_name=? WHERE emp_id= ?"; //PLACEHOLDER
		try {
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter employee name");
			String emp_name = scan.next();
			System.out.println("Enter employee id");
			int emp_id = scan.nextInt();
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, emp_name);
			pstmt.setInt(2, emp_id);
			pstmt.execute();
			System.out.println("Rows are inserted");
			}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
