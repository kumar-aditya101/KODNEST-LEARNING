import java.sql.*;
import java.util.Scanner;;
public class JDBCProgram8 {

	public static void main(String[] args) {
		//JDBC Program to Insert the row in a table by taking the user input.
		String url="jdbc:mysql://localhost:3305/myjdbcdb";
		String username = "root";
		String password = "Root";
		String query = "INSERT INTO EMPLOYEE VALUES(?,?,?)";
		try {
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection Established");
			PreparedStatement pstmt = con.prepareStatement(query);
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Employee id");
			int emp_id = scan.nextInt();
			System.out.println("Enter employee name");
			String emp_name = scan.next();
			System.out.println("Enter employee salary");
			int emp_salary = scan.nextInt();
			pstmt.setInt(1,emp_id);
			pstmt.setString(2,emp_name);
			pstmt.setInt(3, emp_salary);
			pstmt.execute();
			System.out.println("Rows are inserted");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
