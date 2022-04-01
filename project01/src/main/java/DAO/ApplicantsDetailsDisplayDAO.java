package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



import model.Assign;
import model.Students;
//import model.students;

public class ApplicantsDetailsDisplayDAO {
	private static Logger log = LogManager.getLogger(ApplicantsDetailsDisplayDAO.class);
public static List<Assign> listallapplicants()throws Exception
	
	{
	List<Assign> ApplicantDetails= new ArrayList<Assign>();
	@SuppressWarnings("resource")
	Scanner obj0=new Scanner(System.in);
	log.info("enter email");
	String Emailid=obj0.next();
	PreparedStatement statement=null;
	ResultSet rs=null;
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
	//log.info(connection);
	String sc = "select * from revapergce where  user_email= ?";
	statement = connection.prepareStatement(sc);
	statement.setString(1,Emailid);
	rs = statement.executeQuery();
	while (rs.next()) 

	{
		String name = rs.getString("Name");
		String userAdmin=rs.getString("user_Admin");
		String userMobileNumber=rs.getString("user_MobileNumber");
	     Integer userAge=rs.getInt("user_Age");
	     Integer year=rs.getInt("user_YearOfStudy");
	     Float Mark=rs.getFloat("user_Mark");
		String useremail=rs.getString("user_email");
		String userPassword=rs.getString("user_Password");
		String branch=rs.getString("user_Branch");
	    
		//String user_Admission_Status = null;
	// 1 row details => stored in 1 model object
	//Assign allObj = new Assign(name, user_Admin, user_MobileNumber, user_Age, year, Mark, user_email, user_Password, user_Admission_Status, branch);
	//System.out.println("Applicant Details"+"\nName:"+allObj.name+"\nUser_Admin:"+allObj.userAdmin+"\nUserMoblieNumber:"+allObj.userMobileNumber+"\nuserAge:"+allObj.userAge+"\nuseremail:"+allObj.userEmail+"\nuserPassword:"+allObj.userPassword+"\nuser_Admission_Status:"+allObj.userAdmissionStatus+"\nuser_Branch:"+allObj.userBranch);
		Assign studentObj1= new Assign(name, userAdmin, userMobileNumber, userAge,year, Mark, useremail, userPassword, branch, branch);
		/*studentObj.setName(name);
		studentObj.setUserAdmin(userAdmin);
		studentObj.setUserMobileNumber(userMobileNumber);
		studentObj.setUserAge(userAge);
		studentObj.setUserYearOfStudy(year);
		studentObj.setUserMark(Mark);
		studentObj.setUserEmail(useremail);
		studentObj.setUserPassword(userPassword);
		studentObj.setUserBranch(branch);*/
		ApplicantDetails.add(studentObj1);
		
		
	}
	connection.close(); 
	return ApplicantDetails;
	   
	}

}
