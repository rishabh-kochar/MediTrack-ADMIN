package webapp.Hospital;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.HospitalAdmin.HospitalAdmin;
import webapp.HospitalAdmin.HospitalAdminService;

/**
 * Servlet implementation class activeHospitalServlet
 */
@WebServlet("/activehospital")
public class activeHospitalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public activeHospitalServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str = request.getQueryString();
		if (str != null) {
			String[] stringArray = str.split("=");
			String id = stringArray[1];
			// System.out.println(id);
			hospitalservices.activeHospital(Integer.parseInt(id));
			Hospital tempHospital = hospitalservices.getHospitalbyID(Integer.parseInt(id));
			HospitalAdmin admin = new HospitalAdmin();
			admin.setHospitalAdminId(0);
			 System.out.println("cdege");
			HospitalAdmin temp = new HospitalAdmin(Integer.parseInt(id), "Administrator", tempHospital.getHospitalName(),
					tempHospital.getHospitalName(), admin);
			hospitalAdminService.addAdmin(temp);
			response.sendRedirect("/admin/hospital");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private HospitalService hospitalservices = new HospitalService();
	private HospitalAdminService hospitalAdminService = new HospitalAdminService();

}
