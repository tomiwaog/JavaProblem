package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmpUpdate {

	public static void main(String[] args) {
		
		
		//Establish Connection
		Connection con=null;
		String url="jdbc:oracle:thin:@localhost:1521:orcl1";
		String uname="scott";
		String pwd="tiger";
		try {
			con=DriverManager.getConnection(url,uname,pwd);
			System.out.println("Connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Create a Statement Object
		try {
			Statement st=con.createStatement();
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter empid to be updated");
			int id=scan.nextInt();
			System.out.println("Enter new Salary");
			float salary=scan.nextFloat();
			String sql="update weworkemp set salary="+salary+" where eid="+id;
			System.out.println(sql);
			int count=st.executeUpdate(sql);
			scan.close();
			if (count==1)
				System.out.println("Record UPDATED!");
			else
				System.out.println("Record NOT UPDATED!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}