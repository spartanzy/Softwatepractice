package SelfImprovement;

import java.sql.*;

public class DBconnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5050:xe", "test", "test");
		
		Statement stmt = conn.createStatement();
		
		CallableStatement cs = conn.prepareCall("");
		
		ResultSet rs = stmt.executeQuery("select * from employees");
		
		while(rs.next()) {
			
			System.out.println(rs.getInt(1)+" and "+rs.getString(2)+ rs.getMetaData());
		}
		
		}catch(ClassNotFoundException c) {
		
		}catch(SQLException s) {
			
		}
	

	}

}
