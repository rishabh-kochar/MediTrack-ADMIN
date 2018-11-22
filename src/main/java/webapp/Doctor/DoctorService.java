
package webapp.Doctor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import webapp.DBConnection.DBConnection;

public class DoctorService {

	private Connection con;

	public DoctorService() {
		try {
			con = DBConnection.getInstance().getConnection();
		} catch (Exception e) {
			con = null;
			System.out.println(e);
		}

	}

	public ArrayList<Doctor> doctorList() throws ClassNotFoundException, SQLException {

		ArrayList<Doctor> doctorls = new ArrayList<>();
		try {

			String sql = "select * from tbldoctor";

			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Doctor tempdoctor = new Doctor(rs.getInt("DoctorID"), rs.getString("DoctorName"),
						rs.getString("username"), rs.getString("password"), rs.getString("DoctorDesignation"),
						rs.getString("DoctorSpecialization"), rs.getString("DoctorContact"),
						rs.getString("DoctorAddress"));

				doctorls.add(tempdoctor);
				
				System.out.println(tempdoctor.toString());

			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return doctorls;

	}

}
