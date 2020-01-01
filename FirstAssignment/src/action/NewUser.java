package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.UserBean;
import dao.ImplUser;

@WebServlet("/NewUser")
public class NewUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String Contact = null;
       
    
    public NewUser() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	//	PrintWriter out=response.getWriter();
		
		System.out.println("Post method");
		try {
		//Take data from jsp page
		System.out.println("in servlet:");
		String Name = request.getParameter("Name");
		System.out.println("Name :"+Name);
		
		String Address = request.getParameter("Address");
		System.out.println("Address :"+Address);
		
		String Email = request.getParameter("Email");
		System.out.println("Email :"+Email);
		
		String[] con = request.getParameterValues("Contact");
		
		String Contact = Arrays.toString(con);
		System.out.println("Contact :"+Contact);
	    
		String Gender = request.getParameter("Gender");
		System.out.println("Gender :"+Gender);

		String City = request.getParameter("City");
		System.out.println("City :"+City);

		String lan[] = request.getParameterValues("Language");
		String Language = Arrays.toString(lan);
		System.out.println("Language :"+Language);
		//Set data as a private in bean folder
		
		UserBean rb = new UserBean();
		System.out.println("in bean class");
		rb.setName(Name);
		rb.setAddress(Address);
		rb.setEmail(Email);
		rb.setContact(Contact);
		rb.setGender(Gender);
		rb.setCity(City);
		rb.setLanguage(Language);
		
		int status = ImplUser.insert(rb);
		if(status>=0)
			{
				System.out.println("Data is inserted");
				RequestDispatcher r = request.getRequestDispatcher("Home.jsp");
				r.forward(request, response);

			}else
			{
				System.out.println("Data is not inserted");
			}

			}catch (Exception e) {
					e.printStackTrace();
			}
		
		}
}
	


