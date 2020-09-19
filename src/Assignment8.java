

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Assignment8
 */
@WebServlet("/Assignment8")
public class Assignment8 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Assignment8() {
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
		out.println("<form action='Assignment8' method='post'>");
		out.println("<h1>Assignment8</h1>");
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
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		System.out.println(user+" "+pass);
		Cookie c1=new Cookie("username",user);
		Cookie c2=new Cookie("password",pass);
		response.addCookie(c1);
		response.addCookie(c2);
		request.getRequestDispatcher("cookie").forward(request, response);
	}

}
