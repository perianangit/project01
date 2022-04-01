package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import model.Assign;
//import project.UserRegistration;

public class FeesDAO {
	public static void feesfeatures() throws Exception
	{
		
		PreparedStatement statement = null;
		ResultSet rs = null;
		Scanner obj5=new Scanner(System.in);
		System.out.println("enter email id");
		String EmailId=obj5.next();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		System.out.println(connection);
		String sql1 = "select Name,user_Branch,user_YearOfStudy from revapergce where  user_email= ?";
		statement = connection.prepareStatement(sql1);
		statement.setString(1,EmailId);
		rs = statement.executeQuery();
		while (rs.next()) 
		
		{
			String name = rs.getString("Name");
			String branch=rs.getString("user_Branch");
			Integer year=rs.getInt("user_YearOfStudy");
		    
			// 1 row details => stored in 1 model object
		Assign nameObj = new Assign(name, branch, branch, year, year, year, branch, branch, branch, branch);
		System.out.println("Fees Structure for Name "+nameObj.name+" Studying "+nameObj.userYearOfStudy+" year in the dept "+nameObj.userBranch+" 35,000");	
		}
			connection.close();
			obj5.close();
		}
}
