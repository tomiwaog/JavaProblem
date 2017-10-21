package sql;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url ="jdbc:oracle:thin:@localhost:1521:orcl1";
		String username= "scott";
		String password = "tiger";
		
		
		try{
			Statement st = DriverManager.getConnection(url, username,password).createStatement();			
			//SQL Statement
			String mySqlStatement = "insert into weworkemp values('HThames',5800,'Clerks',2500)";
			if (st.executeUpdate(mySqlStatement) == 1){
				System.out.println("Select Query Successful!");
			}else
				System.out.println("Select Query NOT Successful!");
		}catch(SQLException e){
			e.printStackTrace();
		}
		

	}

}
