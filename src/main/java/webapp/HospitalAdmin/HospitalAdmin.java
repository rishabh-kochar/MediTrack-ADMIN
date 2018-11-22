package webapp.HospitalAdmin;

import webapp.Hospital.Hospital;

public class HospitalAdmin {

	int hospitalAdminId;
	Hospital hospitalId;
	String hospitalAdminName;
	String hospitalAdminUsername;
	String hospitalAdminPassword;
	String hospitalAdminEmail;
	String hospitalAdminContactNo;
	HospitalAdmin approvedBy;

	public HospitalAdmin(int id, String hospitalAdminName, String hospitalAdminUsername,
			String hospitalAdminPassword, HospitalAdmin approvedBy) {
		super();
		Hospital temp = new Hospital();
		temp.setHospitalID(id);
		this.hospitalId = temp;
		this.hospitalAdminName = hospitalAdminName;
		this.hospitalAdminUsername = hospitalAdminUsername;
		this.hospitalAdminPassword = hospitalAdminPassword;
		this.approvedBy = approvedBy;
	}

	public HospitalAdmin(String id, String hospitalAdminName2, String hospitalName, String hospitalName2, int i) {
		// TODO Auto-generated constructor stub
	}

	public HospitalAdmin() {
		
	}

	public int getHospitalAdminId() {
		return hospitalAdminId;
	}

	public void setHospitalAdminId(int hospitalAdminId) {
		this.hospitalAdminId = hospitalAdminId;
	}

	public Hospital getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(Hospital hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalAdminName() {
		return hospitalAdminName;
	}

	public void setHospitalAdminName(String hospitalAdminName) {
		this.hospitalAdminName = hospitalAdminName;
	}

	public String getHospitalAdminUsername() {
		return hospitalAdminUsername;
	}

	public void setHospitalAdminUsername(String hospitalAdminUsername) {
		this.hospitalAdminUsername = hospitalAdminUsername;
	}

	public String getHospitalAdminPassword() {
		return hospitalAdminPassword;
	}

	public void setHospitalAdminPassword(String hospitalAdminPassword) {
		this.hospitalAdminPassword = hospitalAdminPassword;
	}

	public String getHospitalAdminEmail() {
		return hospitalAdminEmail;
	}

	public void setHospitalAdminEmail(String hospitalAdminEmail) {
		this.hospitalAdminEmail = hospitalAdminEmail;
	}

	public String getHospitalAdminContactNo() {
		return hospitalAdminContactNo;
	}

	public void setHospitalAdminContactNo(String hospitalAdminContactNo) {
		this.hospitalAdminContactNo = hospitalAdminContactNo;
	}

	public HospitalAdmin getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(HospitalAdmin approvedBy) {
		this.approvedBy = approvedBy;
	}
}
