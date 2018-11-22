
package webapp.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import webapp.DBConnection.DBConnection;

public class LoginService {

	private Connection con;

	public LoginService() {
		try {
			con = DBConnection.getInstance().getConnection();
		} catch (Exception e) {
			con = null;
			System.out.println(e);
		}

	}

	public boolean isUserValid(String user, String password) {

		try {

			String sql;
			sql = "SELECT * FROM tbladmin WHERE AdminUserName=? and AdminPassword=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, user);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				return true;
			}
			return false;

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
		return false;

	}

}
