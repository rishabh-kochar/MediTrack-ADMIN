package webapp.Hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import webapp.admin.Admin;

import webapp.DBConnection.DBConnection;

public class HospitalService {

	private Connection con;

	public HospitalService() {
		try {
			con = DBConnection.getInstance().getConnection();
		} catch (Exception e) {
			con = null;
			System.out.println(e);
		}

	}
	
	public void deactiveHospital(int id) {
		try {
			
			String sql = "UPDATE tblhospital set Status=0 WHERE HospitalID=" + id;
			PreparedStatement pst = con.prepareStatement(sql);
			pst.executeUpdate();
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void activeHospital(int id) {
		try {
			
			String sql = "UPDATE tblhospital set Status=1 WHERE HospitalID=" + id;
			PreparedStatement pst = con.prepareStatement(sql);
			pst.executeUpdate();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

	public Hospital getHospitalbyID(int id) {

		try {

			// System.out.println("vsgsgsghrh");
			String sql = "Select *,ht.HospitalTypeID as HospitalTypeID,a.AdminID as AdminID From tblhospital h,tbladmin a, tblhospitaltype ht "
					+ "where a.AdminID = h.ApprovedBy AND ht.HospitalTypeID = h.HospitalTypeID " + "AND HospitalID = ?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {

				Hospital temphospital = new Hospital(rs.getShort("HospitalID"), rs.getString("Hospitalname"),
						rs.getString("HospitalAddress"), rs.getString("HospitalRegistrationNo"),
						rs.getString("HospitalContactNo"), rs.getString("HospitalEmailId"), rs.getString("WebsiteURL"),
						rs.getString("LocationURL"), rs.getInt("Status"), rs.getDate("ApprovedDate"),
						rs.getString("OpeningTime"), rs.getString("ClosingTime"));
				HospitalType temphospitaltype = new HospitalType(rs.getInt("HospitalTypeID"),
						rs.getString("HospitalType"), rs.getString("Description"));
				Admin tempadmin = new Admin(rs.getInt("AdminID"), rs.getString("AdminName"),
						rs.getString("AdminUserName"), rs.getString("AdminPassword"), rs.getString("Email"),
						rs.getString("ContactNo"), rs.getDate("DateofCreation"));
				temphospital.setApprovedby(tempadmin);
				temphospital.setHospitalTypeID(temphospitaltype);
				return temphospital;

			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	public ArrayList<HospitalType> hospitalTypeList() throws ClassNotFoundException, SQLException {

		ArrayList<HospitalType> hospitalType = new ArrayList<>();
		try {

			// System.out.println("vsgsgsghrh");
			String sql = "Select * From tblhospitaltype ht";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {

				HospitalType temphospitaltype = new HospitalType(rs.getInt("HospitalTypeID"),
						rs.getString("HospitalType"), rs.getString("Description"));
				hospitalType.add(temphospitaltype);
				// System.out.println(rs.getString("Hospitalname"));

			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return hospitalType;

	}

	public ArrayList<Hospital> hospitalList() throws ClassNotFoundException, SQLException {

		ArrayList<Hospital> hospitals = new ArrayList<>();
		try {

			// System.out.println("vsgsgsghrh");
			String sql = "Select *,ht.HospitalTypeID as HospitalTypeID,a.AdminID as AdminID From tblhospital h,tbladmin a, tblhospitaltype ht where a.AdminID = h.ApprovedBy "
					+ " AND ht.HospitalTypeID = h.HospitalTypeID ";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Hospital temphospital = new Hospital(rs.getShort("HospitalID"), rs.getString("Hospitalname"),
						rs.getString("HospitalAddress"), rs.getString("HospitalRegistrationNo"),
						rs.getString("HospitalContactNo"), rs.getString("HospitalEmailId"), rs.getString("WebsiteURL"),
						rs.getString("LocationURL"), rs.getInt("Status"), rs.getDate("ApprovedDate"),
						rs.getString("OpeningTime"), rs.getString("ClosingTime"));
				HospitalType temphospitaltype = new HospitalType(rs.getInt("HospitalTypeID"),
						rs.getString("HospitalType"), rs.getString("Description"));
				Admin tempadmin = new Admin(rs.getInt("AdminID"), rs.getString("AdminName"),
						rs.getString("AdminUserName"), rs.getString("AdminPassword"), rs.getString("Email"),
						rs.getString("ContactNo"), rs.getDate("DateofCreation"));
				temphospital.setApprovedby(tempadmin);
				temphospital.setHospitalTypeID(temphospitaltype);
				hospitals.add(temphospital);
				System.out.println(rs.getString("HospitalID"));

			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return hospitals;

	}

	public void addHospital(String hospitalName, String hospitalAddress, String hospitalRegistrationNo,
			String hospitalContactNo, String hospitalEmail, int hospitalTypeId, String hospitalWebsite,
			String hospitalLocation, String openingTime, String closingTime)
			throws ClassNotFoundException, SQLException {

		try {

			String sql = "INSERT INTO tblhospital(HospitalName, HospitalAddress, "
					+ "HospitalRegistrationNo, HospitalContactNo, HospitalEmailId, "
					+ "HospitalTypeID, WebsiteURL, LocationURL, Status, ApprovedBy, ApprovedDate, "
					+ "OpeningTime, ClosingTime) " + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, hospitalName);
			pst.setString(2, hospitalAddress);
			pst.setString(3, hospitalRegistrationNo);
			pst.setString(4, hospitalContactNo);
			pst.setString(5, hospitalEmail);
			pst.setInt(6, hospitalTypeId);
			pst.setString(7, hospitalWebsite);
			pst.setString(8, hospitalLocation);
			pst.setInt(9, 1);
			pst.setInt(10, 0);
			Date date = new Date();
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			pst.setDate(11, sqlDate);
			pst.setString(12, openingTime);
			pst.setString(13, closingTime);
			pst.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void updateHospital(String hospitalName, String hospitalAddress, String hospitalRegistrationNo,
			String hospitalContactNo, String hospitalEmail, int hospitalTypeId, String hospitalWebsite,
			String hospitalLocation, String openingTime, String closingTime,int id) {
		
		try {

			String sql = "UPDATE tblhospital SET HospitalName=?,HospitalAddress=?,HospitalRegistrationNo=?,"
					+ "HospitalContactNo=?,HospitalEmailId=?,HospitalTypeID=?,WebsiteURL=?,"
					+ "LocationURL=?,Status=?,ApprovedBy=?,OpeningTime=?,ClosingTime=? WHERE "
					+ "HospitalID=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, hospitalName);
			pst.setString(2, hospitalAddress);
			pst.setString(3, hospitalRegistrationNo);
			pst.setString(4, hospitalContactNo);
			pst.setString(5, hospitalEmail);
			pst.setInt(6, hospitalTypeId);
			pst.setString(7, hospitalWebsite);
			pst.setString(8, hospitalLocation);
			pst.setInt(9, 1);
			pst.setInt(10, 0);
			pst.setString(11, openingTime);
			pst.setString(12, closingTime);
			pst.setInt(13, id);
			pst.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
