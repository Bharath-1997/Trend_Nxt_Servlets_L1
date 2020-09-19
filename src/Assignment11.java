

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Assignment11
 */
@WebServlet("/Assignment11")
public class Assignment11 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Assignment11() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<form action='Assignment11' method='post'>");
		out.println("<h1>Assignment11</h1>");
		out.println("<label for='user'>Username</lable>");
		out.println("<input type='text' id='user' name='user'");
		out.println("<br>");
		out.println("<label for='pass'>Password</lable>");
		out.println("<input type='password' id='pass' name='pass'");
		out.println("<br>");
		out.println("<input type='submit' value='submit'>");
		out.println("</form");
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		HttpSession session=request.getSession(false);
		if(request.getParameter("user").equals(request.getParameter("pass")))
		{
			if(session==null)
			{
				session.setAttribute("user",request.getParameter("user").toString());
				out.print("new user logged in");
				request.getRequestDispatcher("/admin");
			}
			else
			{
				out.print("User already logged in "+session.getAttribute("user").toString());
			}
		}
		
	}

}
