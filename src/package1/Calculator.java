package package1;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator  extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int  i =Integer.parseInt(req.getParameter("num1"));
		int  j= Integer.parseInt(req.getParameter("num2"));
		int c=i+j;
		res.getWriter().println("Rajinder Sir : Result is :  " + c);
		
		
	}

}
