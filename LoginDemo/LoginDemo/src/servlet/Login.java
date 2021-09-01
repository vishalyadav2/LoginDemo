package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Login",urlPatterns = "/Login")
public class Login extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		
		String user=req.getParameter("t1");
		String pass=req.getParameter("t2");

		
		if(user.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("pass@123"))
		
			
			out.println("Welcome ");

		
		else
		
			
			out.println("Invalid username and Password");
		
			out.close();

		
	}
	

}
