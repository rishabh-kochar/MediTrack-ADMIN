package webapp.home;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChnagePasswordServlet
 */
@WebServlet("/chnagepassword")
public class ChnagePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HomeService homeservice = new HomeService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChnagePasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String currentPassword = request.getParameter("currentpassword");
		String newPassword = request.getParameter("newpassword");
		String confirmPassword = request.getParameter("confirmpassword");
		
		if(newPassword.equals(confirmPassword)) {
			
			String id = (String) request.getSession(false).getAttribute("sessionAdminID");
			boolean res = homeservice.changePassword(id , currentPassword, newPassword);
			if(!res) {
				request.setAttribute("errorMessage", "Current Password Doesn't Match!");
				request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(
						request, response);
			}else {
				request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(
						request, response);
			}
			
		}else {
			request.setAttribute("errorMessage", "New Password and Confirm Password Must Be Same!");
			request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(
					request, response);
		}
	}

}