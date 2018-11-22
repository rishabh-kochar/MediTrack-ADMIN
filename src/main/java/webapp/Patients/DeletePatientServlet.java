package webapp.Patients;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeletePatientServlet
 */
@WebServlet("/deletepatient")
public class DeletePatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private PatientService patientService = new PatientService(); 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePatientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str = request.getQueryString();
		if(str != null) {
			String[] stringArray = str.split("=");
			String id = stringArray[1];
			//System.out.println(id);
			patientService.deletepatient(Integer.parseInt(id));
			response.sendRedirect("/admin/patient");
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
