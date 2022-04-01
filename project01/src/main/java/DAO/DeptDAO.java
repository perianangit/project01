package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import model.Assign;

public class DeptDAO {
	public static void selectdepartment() throws Exception
	{
		PreparedStatement statement = null;
		ResultSet rs = null;
		Scanner obj7=new Scanner(System.in);
		System.out.println("enter email id");
		String EmailId=obj7.next();
		System.out.println("select 1 for ECE");
		System.out.println("select 2 for EEE");
		System.out.println("select 3 for MECH");
		System.out.println("select 4 for CIVIL");
		System.out.println("select 5 for CS");
		int dept_Option=obj7.nextInt();
		String d = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		System.out.println(connection);
		String sql = "select Name from revapergce where  user_email= ?";
		statement = connection.prepareStatement(sql);
		statement.setString(1,EmailId);
		rs = statement.executeQuery();
		while (rs.next()) 
		{
			String name = rs.getString("Name");
		
			// 1 row details => stored in 1 model object
		Assign deptObj = new Assign(name, name, name, 0, 0, 0, name, name, name, name);
		
		
		
		if(dept_Option==1)
		{
		  d="ECE";	
		}
		else if(dept_Option==2)
		{
		  d="EEE";	
		}
		else if(dept_Option==3)
		{
		  d="MECH";	
		}
		else if(dept_Option==4)
		{
		  d="CIVIL";	
		}
		else if(dept_Option==5)
		{
		  d="CS";	
		}
		String query3="UPDATE revapergce SET user_Branch='"+d+"' WHERE user_email='"+EmailId+"' ";
		RegisterDAO.runquery(query3);	
		System.out.println("Dept "+d+" Name "+name);
	}
		connection.close();
		obj7.close();
	}
}
