package Academy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;


		
public class databaseconnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		String host="localhost"; 
		String port="3306";
	//connection method to the java database with the getconnection method
   Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/MercuryAutomation?autoReconnect=true&useSSL=false","root", "Pathankot@584");
    //once connection is made the person is putting a way to create a statement.
    Statement st= (Statement) con.createStatement();
   	ResultSet rs=st.executeQuery("select  * from Employeeinfo where location='brisbane'");
   	while(rs.next())
   	{
   	System.out.println(rs.getString("name"));
    System.out.println(rs.getString("location"));
	}
	}
	
	
}