package project01;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import DAO.ApplicantsDetailsDisplayDAO;
import DAO.ApplicantsNameDisplayDAO;

import model.Students;


public class ApplicantsNameDisplayDAOTest {
	private static Logger log = LogManager.getLogger(ApplicantsNameDisplayDAOTest.class);
	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		//ApplicantsNameDisplayDAO.listingApplicants();
		List<Students> Applicants = ApplicantsNameDisplayDAO.listingApplicants();
		for(Students applicant:Applicants)
		{
		log.info(applicant);
		}
	}
}
