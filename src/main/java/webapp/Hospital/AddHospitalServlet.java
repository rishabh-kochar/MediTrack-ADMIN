package webapp.Hospital;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class AddHospital
 */
@WebServlet("/addhospital")
public class AddHospitalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private HospitalService hospitalservices = new HospitalService(); 
    public AddHospitalServlet() {
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
			System.out.println(id);
			request.setAttribute("hospitalID",id);
			request.setAttribute("hospitalData",hospitalservices.getHospitalbyID(Integer.parseInt(id)));
			
		}
		else {
			request.setAttribute("hospitalID","new");
		}
		try {
			request.setAttribute("hospitalType",hospitalservices.hospitalTypeList() );
			//System.out.println("vfdb");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("WEB-INF/views/addHospital.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String hospitalName = request.getParameter("hospitalName");
		String hospitalAddress = request.getParameter("hospitalAddress");
		String hospitalRegistrationNo = request.getParameter("hospitalRegistrationNo");
		String hospitalContactNo = request.getParameter("hospitalContactNo");
		String hospitalEmail = request.getParameter("hospitalemail");
		int hospitalTypeId = Integer.parseInt(request.getParameter("hospitalTypeId"));
		String hospitalLocation = request.getParameter("hospitallocation");
		String hospitalWebsite = request.getParameter("hospitalwebsite");
		String openingTime = request.getParameter("openingTime");
		String closingTime = request.getParameter("closingTime");
		String hospitalID = request.getParameter("hospitalID");
		
		try {
			if(hospitalID.equals("new")) {
				addhospital.addHospital(hospitalName, hospitalAddress, hospitalRegistrationNo, hospitalContactNo, hospitalEmail, hospitalTypeId, hospitalWebsite, hospitalLocation, openingTime, closingTime);
			}else {
				addhospital.updateHospital(hospitalName, hospitalAddress, hospitalRegistrationNo, hospitalContactNo, hospitalEmail, hospitalTypeId, hospitalWebsite, hospitalLocation, openingTime, closingTime, Integer.parseInt(hospitalID));
			}
		}catch(Exception e){
			System.out.println(e);
		}
		
		
		
		response.sendRedirect("/admin/hospital");
	}

	private HospitalService addhospital = new HospitalService();
}
