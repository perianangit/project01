package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

import model.Assign;



public class RegisterDAO {
	public static void runquery(String query)throws Exception
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
	
	java.sql.Statement statement=connection.createStatement();
	int rows=statement.executeUpdate(query);
	
	connection.close();
	}
	public static void insertUser(Assign obj) throws Exception 
	{
		String query1="insert into revapergce(name,user_Admin,user_MobileNumber,user_Age,user_YearOfStudy,user_Mark,user_email,user_Password,user_Admission_Status,user_Branch)values('"+ obj.name+"','" +obj.userAdmin+"','"+obj.userMobileNumber +"','"+obj.userAge +"','"+obj.userYearOfStudy+"','"+obj.userMark+"','"+obj.userEmail +"','"+obj.userPassword +"','"+obj.userAdmissionStatus +"','"+obj.userBranch +"')";
		//System.out.println(query1);
		runquery(query1);
	}
}
