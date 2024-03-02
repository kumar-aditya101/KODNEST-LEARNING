
import java.util.Scanner;
import java.sql.*;

public class JDBCProgram10 {

	public static void main(String[] args) {
		// 
		
		String url= "jdbc:mysql://localhost:3305/myjdbcdb";
		String username = "root";
		String password = "Root";
		
		
		try {
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established");
			
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your choice:");
			int choice = scan.nextInt();
			switch(choice) {
			case 1: insert(con);
			break;
			case 2: update(con);
			break;
			case 3: delete(con);
			break;
			case 4: fetchData(con);
			break;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	static void insert(Connection con)throws Exception{
		String query = "INSERT INTO EMPLOYEE VALUES(?,?,?)";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee id");
		int emp_id = scan.nextInt();
		System.out.println("Enter employee name");
		String emp_name = scan.next();
		System.out.println("Enter employee salary");
		int emp_salary = scan.nextInt();
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1,emp_id);
		pstmt.setString(2,emp_name);
		pstmt.setInt(3,emp_salary);
		pstmt.execute();
		System.out.println("Row are inserted");
		fetchData(con);
		
	}
	
	static void update(Connection con)throws Exception{
		String query = "UPDATE EMPLOYEE SET EMP_NAME=? WHERE EMP_ID=?";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee name");
		String emp_name = scan.next();
		System.out.println("Enter employee id");
		int emp_id = scan.nextInt();
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1,emp_name);
		pstmt.setInt(2,emp_id);
		pstmt.executeUpdate();
		System.out.println("Row are Updated");
		fetchData(con);
	}
	static void delete(Connection con)throws Exception{
		String query = "DELETE FROM EMPLOYEE WHERE EMP_ID=?";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee id");
		int emp_id = scan.nextInt();
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.executeUpdate();
		System.out.println("Rows are deleted");
		fetchData(con);
	}
	static void fetchData(Connection con)throws Exception{
		String query = "SELECT * FROM EMPLOYEE WHERE EMP_ID=?";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee id");
		int emp_id = scan.nextInt();
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1,emp_id);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}

	}

}
