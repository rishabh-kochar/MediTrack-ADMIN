package webapp.admin;

import java.util.Date;

public class Admin {

	int AdminID;
	String AdminName;
	String AdminUsername;
	String AdminPassword;
	String Email;
	String ContactNo;

	public Admin(int adminID, String adminName, String adminUsername, String adminPassword, String email,
			String contactNo, Date dateOfCreation) {
		super();
		AdminID = adminID;
		AdminName = adminName;
		AdminUsername = adminUsername;
		AdminPassword = adminPassword;
		Email = email;
		ContactNo = contactNo;
		DateOfCreation = dateOfCreation;
	}

	Date DateOfCreation;

	public int getAdminID() {
		return AdminID;
	}

	public void setAdminID(int adminID) {
		AdminID = adminID;
	}

	public String getAdminName() {
		return AdminName;
	}

	public void setAdminName(String adminName) {
		AdminName = adminName;
	}

	public String getAdminUsername() {
		return AdminUsername;
	}

	public void setAdminUsername(String adminUsername) {
		AdminUsername = adminUsername;
	}

	public String getAdminPassword() {
		return AdminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		AdminPassword = adminPassword;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getContactNo() {
		return ContactNo;
	}

	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}

	public void setDateOfCreation(Date dateOfCreation) {
		DateOfCreation = dateOfCreation;
	}
}
