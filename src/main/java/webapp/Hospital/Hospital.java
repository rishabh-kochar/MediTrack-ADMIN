package webapp.Hospital;

import java.util.Date;

import webapp.admin.Admin;

public class Hospital {

	int hospitalID;
	private String hospitalName;
	String hospitalAddress;
	String hospitalRegistrationNo;
	String hospitalContactNo;
	String hospitalEmailID;
	HospitalType hospitalTypeID;
	String hospitalWebsiteURL;
	String hospitalLocationURL;
	int status;
	Admin approvedby;
	Date approvedDate;
	String openingTime;
	String closingTime;

	public int getHospitalID() {
		return hospitalID;
	}

	public void setHospitalID(int hospitalID) {
		this.hospitalID = hospitalID;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalAddress() {
		return hospitalAddress;
	}

	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

	public String getHospitalRegistrationNo() {
		return hospitalRegistrationNo;
	}

	public void setHospitalRegistrationNo(String hospitalRegistrationNo) {
		this.hospitalRegistrationNo = hospitalRegistrationNo;
	}

	public String getHospitalContactNo() {
		return hospitalContactNo;
	}

	public void setHospitalContactNo(String hospitalContactNo) {
		this.hospitalContactNo = hospitalContactNo;
	}

	public String getHospitalEmailID() {
		return hospitalEmailID;
	}

	public void setHospitalEmailID(String hospitalEmailID) {
		this.hospitalEmailID = hospitalEmailID;
	}

	public HospitalType getHospitalTypeID() {
		return hospitalTypeID;
	}

	public void setHospitalTypeID(HospitalType hospitalTypeID) {
		this.hospitalTypeID = hospitalTypeID;
	}

	public String getHospitalWebsiteURL() {
		return hospitalWebsiteURL;
	}

	public void setHospitalWebsiteURL(String hospitalWebsiteURL) {
		this.hospitalWebsiteURL = hospitalWebsiteURL;
	}

	public String getHospitalLocationURL() {
		return hospitalLocationURL;
	}

	public void setHospitalLocationURL(String hospitalLocationURL) {
		this.hospitalLocationURL = hospitalLocationURL;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	

	public Hospital(int hospitalID, String hospitalName, String hospitalAddress, String hospitalRegistrationNo,
			String hospitalContactNo, String hospitalEmailID, String websiteURL, String locationURL, int status,
			Date approvedDate, String openingTime, String closingTime) {
		super();
		this.hospitalID = hospitalID;
		this.hospitalName = hospitalName;
		this.hospitalAddress = hospitalAddress;
		this.hospitalRegistrationNo = hospitalRegistrationNo;
		this.hospitalContactNo = hospitalContactNo;
		this.hospitalEmailID = hospitalEmailID;
		hospitalWebsiteURL = websiteURL;
		hospitalLocationURL = locationURL;
		this.status = status;
		this.approvedDate = approvedDate;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
	}

	public Hospital() {
		// TODO Auto-generated constructor stub
	}

	public Admin getApprovedby() {
		return approvedby;
	}

	public void setApprovedby(Admin approvedby) {
		this.approvedby = approvedby;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	public void setOpeningTime(String openingTime) {
		this.openingTime = openingTime;
	}

	public void setClosingTime(String closingTime) {
		this.closingTime = closingTime;
	}

	public String getOpeningTime() {
		return openingTime;
	}

	public String getClosingTime() {
		return closingTime;
	}

	
	

}
