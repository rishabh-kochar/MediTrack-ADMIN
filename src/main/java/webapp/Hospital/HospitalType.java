package webapp.Hospital;

public class HospitalType {

	private int hospitalTypeID;
	private String hospitalType;
	private String description;

	public HospitalType(int hospitalTypeID, String hospitalType, String description) {
		super();
		this.hospitalTypeID = hospitalTypeID;
		this.hospitalType = hospitalType;
		this.description = description;
	}
	
	public int getHospitalTypeID() {
		return hospitalTypeID;
	}

	public void setHospitalTypeID(int hospitalTypeID) {
		this.hospitalTypeID = hospitalTypeID;
	}

	public String getHospitalType() {
		return hospitalType;
	}

	public void setHospitalType(String hospitalType) {
		this.hospitalType = hospitalType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
