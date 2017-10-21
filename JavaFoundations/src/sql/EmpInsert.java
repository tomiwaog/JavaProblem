package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpInsert {

	public static void insertMe(){
		// TODO Auto-generated method stub

		Connection con = null;
		String url ="jdbc:oracle:thin:@localhost:1521:orcl1";
		String username= "scott";
		String password = "tiger";
		
		//Connection
		try{
			con = DriverManager.getConnection(url, username,password);
			System.out.println("Connected again!");
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		//Create SQL Statement Object
		try{
			Statement st = con.createStatement();
			String mySqlStatement = "INSERT into weworkemp "+
			"values('Phillipsss', 4350, 'Manager',4000)";
			
			int exec = st.executeUpdate(mySqlStatement);
			if (exec == 1)
				System.out.println("Insertion successful");
			else
				System.out.println("Insertion Failed!");
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		insertMe();
	}

}
