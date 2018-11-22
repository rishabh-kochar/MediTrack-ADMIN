package webapp.Doctor;

public class Doctor {

	int doctorID;
	String doctorName;
	String username;
	String password;
	String doctorDesignation;
	String doctorSpecialization;
	String doctorContact;
	String doctorAddress;

	public int getdoctorID() {
		return doctorID;
	}

	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorUsername() {
		return username;
	}

	public void setDoctorUsername(String username) {
		this.username = username;
	}

	public String getDoctorPassword() {
		return password;
	}

	public void setDoctorPassword(String password) {
		this.password = password;
	}

	public String getDoctorDesignation() {
		return doctorDesignation;
	}

	public void setDoctorDesignation(String doctorDesignation) {
		this.doctorDesignation = doctorDesignation;
	}

	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}

	public void setdoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}

	public String getDoctorContact() {
		return doctorContact;
	}

	public void setDoctorContact(String doctorContact) {
		this.doctorContact = doctorContact;
	}

	public String getDoctorAddress() {
		return doctorAddress;
	}

	public void setDoctorAddress(String doctorAddress) {
		this.doctorAddress = doctorAddress;
	}

	public Doctor(int doctorID, String doctorName, String username, String password, String doctorDesignation,
			String doctorSpecialization, String doctorContact, String doctorAddress) {
		super();
		this.doctorID = doctorID;
		this.doctorName = doctorName;
		this.username = username;
		this.password = password;
		this.doctorDesignation = doctorDesignation;
		this.doctorSpecialization = doctorSpecialization;
		this.doctorContact = doctorContact;
		this.doctorAddress = doctorAddress;

	}

	@Override
	public String toString() {
		return "Doctor [doctorID=" + doctorID + ", doctorName=" + doctorName + ", username=" + username + ", password="
				+ password + ", doctorDesignation=" + doctorDesignation + ", doctorSpecialization="
				+ doctorSpecialization + ", doctorContact=" + doctorContact + ", doctorAddress=" + doctorAddress + "]";
	}
	
	

}
