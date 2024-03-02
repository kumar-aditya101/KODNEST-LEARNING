//import java.sql package
import java.sql.*;
import java.util.Scanner;
public class JDBCProgram6 {

	public static void main(String[] args) {
		//JDBC Program to Insert the row in a table by taking the user input.
		//url, username and password for connecting with DB
		String url = "jdbc:mysql://localhost:3305/myjdbcdb";
		String username ="root";
		String password ="Root";
		//query to be executed
		String query = "INSERT INTO EMPLOYEE VALUES(?,?,?)";//PLACEHOLDER
		try {
			Connection con = DriverManager.getConnection(url,username,password); 
			System.out.println("Connection is established");
			PreparedStatement pstmt = con.prepareStatement(query);
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter employee id");
			int emp_id = scan.nextInt();
			System.out.println("Enter employee name");
			String emp_name = scan.next();
			System.out.println("Enter employee salary");
			int emp_salary = scan.nextInt();
			pstmt.setInt(1,emp_id);
			pstmt.setString(2, emp_name);
			pstmt.setInt(3, emp_salary);
			pstmt.execute();
			System.out.println("Rows are inserted");
			}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
