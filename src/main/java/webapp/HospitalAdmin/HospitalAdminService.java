package webapp.HospitalAdmin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import webapp.DBConnection.DBConnection;

public class HospitalAdminService {

	private Connection con;

	public HospitalAdminService() {
		try {
			con = DBConnection.getInstance().getConnection();
		} catch (Exception e) {
			con = null;
			System.out.println(e);
		}

	}

	public void addAdmin(HospitalAdmin temp) {

		try {
			boolean flag = false;
			String sql = "SELECT * FROM tblhospitaladmin WHERE HospitalID = " + temp.hospitalId.getHospitalID()
					+ " AND ApprovedBy = 0 ";
			System.out.print(sql);
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				flag = true;
			}

			if (!flag) {
				sql = "INSERT INTO tblhospitaladmin(HospitalID, HospitalAdminName, Username, Password, "
						+ "  ApprovedBy) " + "VALUES (?,?,?,?,?)";
				pst = con.prepareStatement(sql);
				pst.setInt(1, temp.hospitalId.getHospitalID());
				pst.setString(2, temp.getHospitalAdminName());
				pst.setString(3, temp.getHospitalAdminUsername());
				pst.setString(4, temp.getHospitalAdminPassword());
				pst.setInt(5, 0);
				pst.executeUpdate();

			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
