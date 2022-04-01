package project01;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import DAO.ApplicantsDetailsDisplayDAO;

public class Starter {
	private static Logger log = LogManager.getLogger(ApplicantsDetailsDisplayDAO.class);
	static Scanner sc=  new Scanner(System.in);
	public static void selectregorad() throws Exception 
	{
		log.info("Welcome to College Admission Site....");
		System.out.println("Enter your option 1 for register ");
		System.out.println("Enter your option 2 for login ");
		int option =sc.nextInt(); 
		
		
		if(option==1)
		{
			Register.registrationgettinginputs();
		}
		else if(option==2)
		{
			Register.logininputs();
		}
	}

}
