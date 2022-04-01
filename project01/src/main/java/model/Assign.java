package model;

public class Assign {
	public String name;
	public String userAdmin;
	public String userMobileNumber;
	public int userAge;
	public int userYearOfStudy;
	public float userMark;
	public String userEmail;
	public String userPassword;
	public String userAdmissionStatus;
	public String userBranch;
	public Assign(String name,String userAdmin,String userMobileNumber,int userAge,int userYearOfStudy,float userMark,String userEmail,String userPassword, String userAdmissionStatus, String userBranch)
	{
		this.name=name;
		this.userAdmin=userAdmin;
		this.userMobileNumber=userMobileNumber;
		this.userAge=userAge;
		this.userYearOfStudy=userYearOfStudy;
		this.userMark=userMark;
		this.userEmail=userEmail;
		this.userPassword=userPassword;
		this.userAdmissionStatus=userAdmissionStatus;
		this.userBranch=userBranch;
	}
	@Override
	public String toString() {
		return "Assign [name=" + name + ", userAdmin=" + userAdmin + ", userMobileNumber=" + userMobileNumber
				+ ", userAge=" + userAge + ", userYearOfStudy=" + userYearOfStudy + ", userMark=" + userMark
				+ ", userEmail=" + userEmail + ", userPassword=" + userPassword + ", userAdmissionStatus="
				+ userAdmissionStatus + ", userBranch=" + userBranch + "]";
	}
	public String getName1() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserAdmin() {
		return userAdmin;
	}
	public void setUserAdmin(String userAdmin) {
		this.userAdmin = userAdmin;
	}
	public String getUserMobileNumber() {
		return userMobileNumber;
	}
	public void setUserMobileNumber(String userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public int getUserYearOfStudy() {
		return userYearOfStudy;
	}
	public void setUserYearOfStudy(int userYearOfStudy) {
		this.userYearOfStudy = userYearOfStudy;
	}
	public float getUserMark() {
		return userMark;
	}
	public void setUserMark(float userMark) {
		this.userMark = userMark;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserAdmissionStatus() {
		return userAdmissionStatus;
	}
	public void setUserAdmissionStatus(String userAdmissionStatus) {
		this.userAdmissionStatus = userAdmissionStatus;
	}
	public String getUserBranch() {
		return userBranch;
	}
	public void setUserBranch(String userBranch) {
		this.userBranch = userBranch;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
