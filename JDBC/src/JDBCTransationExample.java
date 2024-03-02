import java.sql.*;
import java.util.Scanner;
public class JDBCTransationExample {

	public static void main(String[] args) {
		// TODO Auto-g
		String url ="jdbc:mysql://localhost:3305/myjdbcdb";
		String username ="root";
		String password = "Root";
		Connection con = null;
		String query1 = "UPDATE BANK SET BALANCE=BALANCE-? WHERE ACCOUNT_NO=1111";
		String query2 = "UPDATE BANK SET BALANCE=BALANCE+? WHERE ACCOUNT_NO=3333";
		try {
			con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established");
			//1.Setting the auto commit status as false
			con.setAutoCommit(false);
			PreparedStatement pstmt1 = con.prepareStatement(query1);
			PreparedStatement pstmt2 = con.prepareStatement(query2);
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the amount to be transferred");
			int amount = scan.nextInt();
			pstmt1.setInt(1, amount);
			pstmt2.setInt(1, amount);
			pstmt1.executeUpdate();
			System.out.println("Amount is debited from acc_no:1111");
			pstmt2.executeUpdate();
			System.out.println("Amount is credited to acc_no:3333");
			//2.Commiting the changes
			con.commit();
		}
		catch(Exception e) {
			try {
				//3.if any problem occurs,rollback the changes
				con.rollback();
				System.out.println("Changes are rolled back");
			}
			catch(SQLException e1) {
				e1.printStackTrace();
			}
		}	
	}

}
