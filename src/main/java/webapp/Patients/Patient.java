package webapp.Patients;

import java.util.Date;

public class Patient {

	int patientID;
	String patientName;
	String username;
	String password;
	String address;
	String gender;
	String email;
	Date dateOfBirth;
	String contact;

	public Patient(int patientID, String patientName, String username, String password, String address, String gender,
			String email, Date dateOfBirth, String contact, Date joining) {
		super();
		this.patientID = patientID;
		this.patientName = patientName;
		this.username = username;
		this.password = password;
		this.address = address;
		this.gender = gender;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.contact = contact;
		this.joining = joining;
	}

	public int getPatientID() {
		return patientID;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Date getJoining() {
		return joining;
	}

	public void setJoining(Date joining) {
		this.joining = joining;
	}

	Date joining;

}
