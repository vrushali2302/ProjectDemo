package action;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.BeanForm;
 
@WebServlet("/FormAction")
public class FormAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public FormAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		try {
			System.out.println("welcome");
			String Username = request.getParameter("Username");
			System.out.println("Userid :" +Username);
			 
			String Password = request.getParameter("Password");
			System.out.println("Password :" +Password);
			
			BeanForm rb = new BeanForm(); 
		   rb.SetUsername(Username);
		   rb.setPassword(Password);
		  
		// int status = ImplUser.insert(rb);
		   if(Username.equals("Admin") && Password.equals("123"))
		   {
			   
			   System.out.println("Login successfully");
			   response.sendRedirect("Home.jsp");

		   }
		   else
		   {
			   System.out.println("Login failed.."); 
			   response.sendRedirect("Login.jsp");

			   
		   }
		   /*
			  Object d;
			  if(d.valid_data(Username,Password))
			{
				System.out.println("for table formate");
				RequestDispatcher rd = request.getRequestDispatcher("home.jsp"); 
				rd.forward(request, response);
			}
			else
			{
		           request.setAttribute("errorMessage", "Invalid user or password");
		           response.sendRedirect("login.jsp");
		           	}*/
		}
		   catch (Exception e) {
				  e.printStackTrace();
				 }

	}

}