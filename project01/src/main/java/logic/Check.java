package logic;

import java.util.Scanner;

import DAO.RegisterDAO;
import model.Assign;
//import project01.Selectregorad;

public class Check {
	public static void validatingRegistration(Assign car) throws Exception
	{
		int isNameValid = nameValidation(car.name);
		int isUserOrAdminValid = userOrAdminValidation(car.userAdmin);
		int isMobileValid = user_MobileNumberValidation(car.userMobileNumber);
		int isAgeValid = userAgeValidation(car.userAge);
		int isuserYearOfStudyValid = userYearOfStudyValidation(car.userYearOfStudy);
		int isuserMarkValid = userMarkValidation(car.userMark);
		int isEmailValid = userEmailValidation(car.userEmail);
		int isPasswordValid = userPasswordValidation(car.userPassword);
		if (isNameValid + isUserOrAdminValid + isMobileValid + isAgeValid + isuserYearOfStudyValid + isuserMarkValid
				+ isEmailValid + isPasswordValid == 8)
		{
			System.out.println("Welcome");
			System.out.println("you have registered successfully");
			RegisterDAO.insertUser(car);
			
		} 
		else
		{
			throw new Exception("Please Re-Enter Your Details");
		}
	}

	public static int nameValidation(String name) throws Exception
	{
		if (name != null || name.isBlank()||name.isEmpty())
		{
			return 1;
		} else
		{
			throw new Exception("enter a valid name");
		}
	}

	public static int userOrAdminValidation(String userAdmin) throws Exception 
	{
		if (userAdmin.equals("user") || userAdmin.equals("admin"))
		{
			return 1;
		} else
		{
			throw new Exception("enter user or admin alone");
		}
	}

	public static int user_MobileNumberValidation(String userMobileNumber) throws Exception
	{
		char[] mobile = userMobileNumber.toCharArray();
		if(mobile.length == 10)
		{
			for (char i : mobile)
			{

				if (Character.isAlphabetic(i)) 
				{
					throw new Exception("enter only numeric values");
				}
			}
		}
		return 1;
		
		
			
		}


		
	

	public static int userAgeValidation(int userAge) throws Exception
	{
		if (userAge < 0)
		{
			throw new Exception("enter a valid age");
		} else {
			return 1;
		}
	}

	public static int userYearOfStudyValidation(int userYearOfStudy) throws Exception 
	{
		if (userYearOfStudy == 1 || userYearOfStudy == 2 || userYearOfStudy == 3 || userYearOfStudy == 4) 
		{
			return 1;
		} else 
		{
			throw new Exception("enter a valid year");
		}
	}

	public static int userMarkValidation(float userMark) throws Exception
	{
		if (userMark <= 100 || userMark > 0)
		{
			return 1;
		} else {
			throw new Exception("enter a valid mark");
		}
	}

	public static int userEmailValidation(String userEmail) throws Exception 
	{
		if (userEmail.contains("@")) 
		{
			return 1;
		} else
		{
			throw new Exception("enter valid email id");
		}
	}

	public static int userPasswordValidation(String userPassword) throws Exception
	{
		if (userPassword.length() < 8)
		{
			return 1;
		} else
		{
			throw new Exception("enter a valid password");
		}
	}

}
