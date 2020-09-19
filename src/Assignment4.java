

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Assignment4
 */
@WebServlet("/Assignment4")
public class Assignment4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Map<String,List<String>>users=new HashMap();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Assignment4() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config) throws ServletException {
		users.put("Bharath", Arrays.asList("123","admin"));
		users.put("Raju", Arrays.asList("123456","employee"));
		users.put("Ravi", Arrays.asList("12345678","employee"));
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd=request.getRequestDispatcher("userslogin.html");  
        rd.include(request,response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		 response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		    String n=request.getParameter("first_name");  
		    String p=request.getParameter("userpass");
		    String t=request.getParameter("type");
		          
		    if(users.get(n) != null){
		    	if(p.equals(users.get(n).get(0))&&t.equals(users.get(n).get(1)))
		    	{
		        RequestDispatcher rd=request.getRequestDispatcher(t+".html");
		        rd.forward(request,response); 		        
		    	}
		    	else
		    	{
		    		out.print("Sorry password or type error");
		    	}
		    }  
		    else{  
		        out.print("Sorry username or password error");
		       // try{Thread.sleep(4000);}catch(InterruptedException e){System.out.println(e);}  
		        //response.sendRedirect(request.getContextPath()+"/userslogin.html");
		        out.close();
		    }  
		          
		   
	}

}
