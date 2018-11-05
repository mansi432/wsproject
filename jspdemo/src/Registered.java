import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class Registered
 */
@WebServlet("/Registered")
public class Registered extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public Registered() {
		super();
	}
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Name = request.getParameter("Name");
		String Password = request.getParameter("Password");
		String EmailId = request.getParameter("EmailId");
		String contact = request.getParameter("Contact");
		
		if(Name.isEmpty()  || Password.isEmpty() || EmailId.isEmpty() || contact.isEmpty())
		{
			RequestDispatcher req = request.getRequestDispatcher("Failure.jsp");
			req.include(request, response);
		}
		else
		{
			RequestDispatcher req = request.getRequestDispatcher("success.jsp");
			req.include(request, response);
		}
	}
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	

}*/
}
