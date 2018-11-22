
package webapp.home;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import webapp.DBConnection.DBConnection;

public class HomeService {

	private Connection con;

	public HomeService() {
		try {
			con = DBConnection.getInstance().getConnection();
		} catch (Exception e) {
			con = null;
			System.out.println(e);
		}

	}

	public boolean changePassword(String id, String password, String newPassword) {

		try {

			String sql;
			sql = "SELECT * FROM tbladmin WHERE AdminID=" + id;
			System.out.println(sql);
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				if (rs.getString("AdminPassword").equals(password)) {
					System.out.println("True");
					sql = "UPDATE tbladmin SET AdminPassword=? WHERE AdminID=?";
					pst = con.prepareStatement(sql);
					pst.setString(1, newPassword);
					pst.setString(2, id);
					pst.executeUpdate();
					return true;
				}
			}
			return false;

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
		return false;

	}

	public int patientCount() {

		try {
			String sql = "SELECT count(*) as count FROM tblpatient";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				return rs.getInt("count");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	public int doctorCount() {

		try {
			String sql = "SELECT count(*) as count FROM tbldoctor";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				return rs.getInt("count");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	public int hospitalCount() {

		try {
			String sql = "SELECT count(*) as count FROM tblhospital";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				return rs.getInt("count");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

}
