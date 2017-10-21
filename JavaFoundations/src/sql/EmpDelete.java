package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmpDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;
		String url="jdbc:oracle:thin:@localhost:1521:orcl1";
		String user = "scott";
		String password = "tiger";
		
		//Create Connection
		try{
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Successfully connected!");
			
		}catch(SQLException s){
			s.printStackTrace();
		}
		
		//Creating Statements
		try{
			Statement st = con.createStatement();
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter employee id to update");
			int empid = scan.nextInt();
			String sql = "DELETE from weworkemp where eid ="+empid;
			System.out.println(sql);
			int count =st.executeUpdate(sql);
			scan.close();
			if (count == 1) System.out.println("Deletion Successful!");
			else System.out.println("Deletion Failed!");
		}catch(SQLException o){
			o.printStackTrace();
		}
		
	}

}
