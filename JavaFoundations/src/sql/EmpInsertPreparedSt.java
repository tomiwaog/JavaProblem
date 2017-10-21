package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpInsertPreparedSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;
		String url ="jdbc:oracle:thin:@localhost:1521:orcl1";
		String username= "scott";
		String password = "tiger";
		
		//Connection
		try{
			con = DriverManager.getConnection(url, username,password);
			System.out.println("Connected!");
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		//Create SQL Statement Object
		try{
			//Statement st = con.createStatement();
			

			@SuppressWarnings("unused")
			String mySqlStatement = "INSERT into weworkemp "+
			"values('Phillips', 450, 'Manager',4000)";
			
			String sql ="insert into weworkemp values(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			int exec = pst.executeUpdate();
			if (exec == 1)
				System.out.println("Insertion successful");
			else
				System.out.println("Insertion Failed!");
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
