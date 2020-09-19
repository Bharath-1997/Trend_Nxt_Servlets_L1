

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Assignment6
 */
@WebServlet("/Assignment6")
public class Assignment6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Assignment6() {
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
		out.println("<form action='Assignment6' method='post'>");
		out.println("<h1>Assignment6</h1>");
		out.println("<label for='input'>Enter number</lable>");
		out.println("<input type='number' id='input' name='id'");
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
		int id=Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		if(id<10)
		request.getRequestDispatcher("page1").include(request, response);
		else if(id<99)
			request.getRequestDispatcher("page2").include(request, response);
		else
			request.getRequestDispatcher("page3").include(request, response);
	}

}
