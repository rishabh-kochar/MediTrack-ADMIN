package webapp.Patients;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import webapp.DBConnection.DBConnection;

public class PatientService {

	private Connection con;

	public PatientService() {
		try {
			con = DBConnection.getInstance().getConnection();
		} catch (Exception e) {
			con = null;
			System.out.println(e);
		}

	}

	public Patient getPatientbyID(int id) {

		try {

			// System.out.println("vsgsgsghrh");
			String sql = "select * from tblpatient where patientid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {

				Patient temppatient = new Patient(rs.getInt("PatientID"), rs.getString("PatientName"),
						rs.getString("username"), rs.getString("password"), rs.getString("address"),
						rs.getString("gender"), rs.getString("email"), rs.getDate("date_of_birth"),
						rs.getString("contact"), rs.getDate("joining"));
				return temppatient;
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	public ArrayList<Patient> PatientList() throws ClassNotFoundException, SQLException {

		ArrayList<Patient> patientls = new ArrayList<>();
		try {

			// System.out.println("vsgsgsghrh");
			String sql = "Select * from tblpatient where Status = 1";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Patient temppatient = new Patient(rs.getInt("PatientID"), rs.getString("PatientName"),
						rs.getString("username"), rs.getString("password"), rs.getString("address"),
						rs.getString("gender"), rs.getString("email"), rs.getDate("date_of_birth"),
						rs.getString("contact"), rs.getDate("joining"));
				patientls.add(temppatient);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return patientls;

	}

	public void addPatient(String PatientName, String username, String password, String address, String gender,
			String email, Date date_of_birth, String contact)

			throws ClassNotFoundException, SQLException {

		System.out.println(date_of_birth);
		try {

			String sql = "insert into tblpatient(PatientName,username,password,address,gender,email,date_of_birth,contact,joining) "
					+ "VALUES (?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, PatientName);
			pst.setString(2, username);
			pst.setString(3, password);
			pst.setString(4, address);
			pst.setString(5, gender);
			pst.setString(6, email);
			pst.setDate(7, (java.sql.Date) date_of_birth);
			pst.setString(8, contact);
			Date date = new Date();
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			pst.setDate(9, sqlDate);

			pst.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void updatePatient(String PatientName, String username, String password, String address, String gender,
			String email, Date date_of_birth, String contact, Date joining) {

		try {

			String sql = "UPDATE tblpatient SET PatientName=?,uername=?,password=?,address=?,gender=?,email=?,date_of_birth=?,contact=?,joining=? WHERE "
					+ "PatientID=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, PatientName);
			pst.setString(2, username);
			pst.setString(3, password);
			pst.setString(4, address);
			pst.setString(5, gender);
			pst.setString(6, email);
			pst.setDate(7, (java.sql.Date) date_of_birth);
			pst.setString(8, contact);
			pst.setDate(9, (java.sql.Date) joining);
			pst.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void deletepatient(int id) {
		// TODO Auto-generated method stub

		try {

			String sql = "UPDATE tblpatient SET Status = 0 WHERE PatientID=" + id;
			PreparedStatement pst = con.prepareStatement(sql);
			pst.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
