package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import model.Students;
//import model.students;

public class ApplicantsNameDisplayDAO {
	private static Logger log = LogManager.getLogger(ApplicantsNameDisplayDAO .class);
	public static List<Students> listingApplicants() throws Exception
	{
		List<Students> Applicants= new ArrayList<Students>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		String user="user";
		String query = "SELECT name FROM revapergce WHERE user_Admin='"+user+"' ";
		Statement st = (Statement) connection.prepareStatement(query);
		ResultSet rs = ((java.sql.Statement) st).executeQuery(query);
		String name = null;
		log.info("All Applicants are......");
		while(rs.next())
		{
		name=rs.getString("name");
		//System.out.println(user1);
		Students studentObj= new Students();
		studentObj.setName(name);
		Applicants.add(studentObj);
		
		}
		connection.close(); 
		return Applicants;
			
	}
	
}
