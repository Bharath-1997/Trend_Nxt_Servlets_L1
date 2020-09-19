

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class viewservlet
 */
@WebServlet("/viewservlet")
public class viewservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewservlet() {
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
		
		out.println("<html>");
		out.println("<head>");
		out.println("<style>\r\n" + 
				"table {\r\n" + 
				"  font-family: arial, sans-serif;\r\n" + 
				"  border-collapse: collapse;\r\n" + 
				"  width: 100%;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"td, th {\r\n" + 
				"  border: 1px solid #dddddd;\r\n" + 
				"  text-align: left;\r\n" + 
				"  padding: 8px;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"tr:nth-child(even) {\r\n" + 
				"  background-color: #dddddd;\r\n" + 
				"}\r\n" + 
				"</style>");
		out.println("</head");
		out.println("<body><h1>"+" "+"</h1><br><br>");
			out.println("<table>");
			out.println("<tr><th>Id</th><th>Start Date</th><th>End Date</th><th>Mode</th><th>Business Unit</th><th>Action</th></tr>");
			
			for(String map:Assignment5.trainings.keySet())
			{
			
			out.println("<tr>");
			out.println("<td>"+Assignment5.trainings.get(map).get(0)+"</td>");
			out.println("<td>"+Assignment5.trainings.get(map).get(1)+"</td>");
			out.println("<td>"+Assignment5.trainings.get(map).get(2)+"</td>");
			out.println("<td>"+Assignment5.trainings.get(map).get(3)+"</td>");
			out.println("<td>"+Assignment5.trainings.get(map).get(4)+"</td>");
			out.println("<td><a href='Deleteservlet?id="+Assignment5.trainings.get(map).get(0)+"'>Delete</a></td>");
			out.println("</tr>");
		    }
			out.println("</table>");
		out.println("</body></html>");
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
