package project01;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import DAO.ApplicantsNameDisplayDAO;
import DAO.LoginDAO;
import DAO.RegisterDAO;
import logic.Check;
import logic.Login;
import model.Assign;
import com.mysql.cj.xdevapi.Schema.Validation;

import model.Assign;



public class Register {
	private static Logger log = LogManager.getLogger(Register.class);
	 static Scanner sc = new Scanner(System.in);
	   public static void registrationgettinginputs() throws Exception{
		   log.info("Enter your name");
		   String name=sc.next();
		   
		   log.info ("enter 'user' or 'admin' ");
		   String userAdmin=sc.next();
		  
		   log.info("Enter your mobile number ");
		   String userMobileNumber=sc.next();
		  
		   log.info("enter your age");
		   int userAge=sc.nextInt();
		  
		   log.info("Enter the year of study(mention it as 1 or 2 or 3 or 4)");
		   int userYearOfStudy=sc.nextInt();
		   
		   log.info("Enter your 12th mark percentage (EX:88.80)");
		   float userMark=sc.nextFloat();
		   
		   log.info("enter your E-mail ID");
		   String userEmail=sc.next();
		  
		   log.info("enter your password");
		   String userPassword=sc.next();
		 
		   String  userAdmissionStatus="pending";
		   String userBranch="not selected";
		   Assign car=new Assign(name,userAdmin,userMobileNumber,userAge,userYearOfStudy,userMark,userEmail,userPassword,userAdmissionStatus,userBranch);
		   try
		   {
			   Check.validatingRegistration(car);
			   log.info("Now");
			   log.info("if you want to go back to main page");
				Starter.selectregorad();
			   
		   }catch(Exception e)
		   {
			   log.warn("error..!!"+e.getMessage());
			   e.printStackTrace();
		   }
		
		   
	   }
	   
public static void logininputs() throws Exception
{
	log.info("enter your email");
	String email=sc.next();
	log.info("enter your password");
	String password=sc.next();
	
	try
	{
	
	String mail=LoginDAO.loginValidatorUsingDatabase(email,password);
	Login.loginmail(mail);
	
	}catch(Exception e)
	{
		log.warn("error..!!"+e.getMessage());
	}
	
	
}
}
