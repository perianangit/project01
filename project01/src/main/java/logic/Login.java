package logic;

public class Login {
	public static String mail;

	public static void loginmail(String email)
	{
		try 
		{
			mail = email;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String getEmail() {
		return mail;
	}
}
