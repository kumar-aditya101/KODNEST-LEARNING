import java.util.Scanner;
import java.sql.*;

public class JDBCProgram12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			//Taking user input, completing the query and adding it to batch
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
			pstmt.addBatch();
			}
			//executing the batch
			pstmt.executeBatch();
			System.out.println("Rows are inserted");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		


	}

}
