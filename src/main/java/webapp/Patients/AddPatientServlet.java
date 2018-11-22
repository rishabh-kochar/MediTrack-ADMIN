package webapp.Patients;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddHospital
 */
@WebServlet("/addpatient")
public class AddPatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	private PatientService patientservices = new PatientService();

	public AddPatientServlet() {
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
			System.out.println(id);
			request.setAttribute("PatientID", id);
			request.setAttribute("patientData", patientservices.getPatientbyID(Integer.parseInt(id)));

		} else {
			request.setAttribute("PatientID", "new");
		}
		request.getRequestDispatcher("WEB-INF/views/addPatient.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String PatientID = request.getParameter("PatientID");
		String PatientName = request.getParameter("PatientName");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String date_of_birth = request.getParameter("date_of_birth");
		System.out.println(date_of_birth);
		String contact = request.getParameter("contact");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = null;
		try {
			date = sdf1.parse(date_of_birth);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
		System.out.println(sqlStartDate);
		

		try {
			if (PatientID.equals("new")) {
				addpatient.addPatient(PatientName, username, password, address, gender, email, sqlStartDate, contact);
			} else {
				//addpatient.updatePatient(PatientName, username, password, address, gender, email, date_of_birth,
				//		contact, joining);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		response.sendRedirect("/admin/patient");
	}

	private PatientService addpatient = new PatientService();
}
