

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Assignment5
 */
@WebServlet("/Assignment5")
public class Assignment5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
     static Map<String,List<String>> trainings=new HashMap();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Assignment5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        
		RequestDispatcher rd=request.getRequestDispatcher("Assignment4");  
        rd.forward(request,response);
	}

	private void insertUser(HttpServletRequest request, HttpServletResponse response) throws Exception, IOException {
		String id=request.getParameter("tid");
		String start_date=request.getParameter("tsdate");
		String end_date=request.getParameter("tedate");
		String mode=request.getParameter("tmode");
		String businessid=request.getParameter("busid");
		trainings.put(id, Arrays.asList(start_date,end_date,mode,businessid));
		System.out.println("The set is: " + trainings.entrySet());
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
        dispatcher.forward(request, response);
	}

	private void listUser(HttpServletRequest request, HttpServletResponse response) throws Exception, Exception {
		RequestDispatcher rd=request.getRequestDispatcher("list.jsp");  
      rd.include(request,response);
		    }

	 private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
			        RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
			        dispatcher.forward(request, response);
			    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
