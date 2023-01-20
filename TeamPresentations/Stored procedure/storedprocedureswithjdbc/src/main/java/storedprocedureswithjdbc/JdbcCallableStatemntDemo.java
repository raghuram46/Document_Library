package storedprocedureswithjdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcCallableStatemntDemo {
	//jdbc driver name and database url
			 static final String driverName = "com.mysql.cj.jdbc.Driver";
			 static final String url = "jdbc:mysql://localhost:3306/presentation";
			
			//database credentials
			 static String USERNAME="root";
			 static String PASSWORD="Reset123";

	public static void main(String[] args) {
		JdbcCallableStatemntDemo jdbcCallableStatemntDemo=new JdbcCallableStatemntDemo();
		jdbcCallableStatemntDemo.getAllEmployeesInfo();
	}
	private void getAllEmployeesInfo() {
		Connection connection=null;
		CallableStatement callableStatement=null;
		try {
			//Register the JDBC driver in the driver manager
			Class.forName(driverName);
			
			//Establish connection to the database using DriverManager
			connection=DriverManager.getConnection(url,USERNAME,PASSWORD);
			String allEmployeesList="{call getAllEmployees()}";
			callableStatement=connection.prepareCall(allEmployeesList);
			ResultSet rs=callableStatement.executeQuery();
			while(rs.next()) {
				int id=rs.getInt(1);
				String code=rs.getString(2);
				String name=rs.getString(3);
				int salary=rs.getInt(4);
				String mobile=rs.getString(5);
				int age=rs.getInt(6);
				//Displaying the values
				System.out.println("ID: "+ id);
				System.out.println(("code"+ code));
				System.out.println(("name"+ name));
				System.out.println(("salary"+ salary));
				System.out.println(("age"+ age));
			}
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(callableStatement != null) {
					callableStatement.close();
				}
			}
			catch(SQLException sqlException) {
				sqlException.printStackTrace();
			}
			try {
				if(connection!=null) {
					connection.close();
				}
			}
			catch(SQLException sqlException) {
				sqlException.printStackTrace();
			}
		}
	}

}
