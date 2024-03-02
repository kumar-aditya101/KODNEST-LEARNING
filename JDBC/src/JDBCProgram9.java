import java.sql.*;
import java.util.Scanner;
public class JDBCProgram9 {

	public static void main(String[] args) {
		// Using separate method to perform Insert,Update,Delete, fetchData Query..
		String url= "jdbc:mysql://localhost:3305/myjdbcdb";
		String username = "root";
		String password = "Root";
		Connection con = null;
		Statement stmt = null;
		try {
			con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established");
			stmt = con.createStatement();
			System.out.println("Statement is ready");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your choice:");
			int choice = scan.nextInt();
			switch(choice) {
			case 1: insert(stmt);
			break;
			case 2: update(stmt);
			break;
			case 3: delete(stmt);
			break;
			case 4: fetchData(stmt);
			break;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	static void insert(Statement stmt)throws Exception{
		String query = "INSERT INTO EMPLOYEE VALUES(1,'AMIT',3500),(2,'Ajay',40000)";
		stmt.executeUpdate(query);
		System.out.println("Row are Updated");
		fetchData(stmt);
		
	}
	
	static void update(Statement stmt)throws Exception{
		String query = "UPDATE EMPLOYEE SET EMP_NAME='ANUJ' WHERE EMP_ID=2";
		stmt.executeUpdate(query);
		System.out.println("Row are Updated");
		fetchData(stmt);
	}
	static void delete(Statement stmt)throws Exception{
		String query = "DELETE FROM EMPLOYEE WHERE EMP_ID=2";
		stmt.executeUpdate(query);
		System.out.println("Rows are deleted");
		fetchData(stmt);
	}
	static void fetchData(Statement stmt)throws Exception{
		String query = "SELECT * FROM EMPLOYEE";
		ResultSet rs = stmt.executeQuery(query);
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
	}

}
