package webapp.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import webapp.login.LoginService;


@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("userName");
		String password = request.getParameter("password");
		
		boolean isUserValid = userValidationService.isUserValid(name, password);
		
		if (isUserValid) {
			request.getSession().setAttribute("sessionName", name);
			request.getSession().setAttribute("sessionAdminID", "0");
			
			response.sendRedirect("/admin/home");
			
		} else {
			request.setAttribute("errorMessage", "Invalid Credentials!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(
					request, response);
		}
	}
	
	private LoginService userValidationService = new LoginService();

}