package project01;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import DAO.ApplicantsDetailsDisplayDAO;
import model.Assign;


public class ApplicantsDetailsDisplayDAOTest {
	private static Logger log = LogManager.getLogger(ApplicantsDetailsDisplayDAOTest.class);
	public static void main(String[] args)throws Exception
	{
		List<Assign> ApplicantDetails=ApplicantsDetailsDisplayDAO.listallapplicants();
	
    for(Assign a:ApplicantDetails)
    	
    {
    	System.out.println(a);
    }

}
}