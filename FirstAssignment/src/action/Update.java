package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.UserBean;
import dao.ImplUser;


@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
			
		}
		
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("UpdateUser");
		try {
		PrintWriter out=response.getWriter();
		System.out.println("updated data");

		

		//int id = Integer.parseInt(id1);
		//int status =ImplUser.update(rb);
		//System.out.println("Id :"+id); 
		System.out.println("update function");
		
		
		String Name = request.getParameter("Name");
		System.out.println("Name :"+Name);
		
		String Address = request.getParameter("Address");
		System.out.println("Address :"+Address);
		
		String Email = request.getParameter("Email");
		System.out.println("Email :"+Email);

		String con[] = request.getParameterValues("Contact");
		String Contact = Arrays.toString(con);
		System.out.println("Contact :"+Contact);

		String Gender = request.getParameter("Gender");
		System.out.println("Gender :"+Gender);

		String City = request.getParameter("City");
		System.out.println("City :"+City);

		//String Language = request.getParameter("Language");
		//System.out.println("Language :"+Language);
		String lan[] = request.getParameterValues("Language");
		String Language = Arrays.toString(lan);
		System.out.println("Language :"+Language);

		
		UserBean rb = new UserBean();
		System.out.println("In bean class");
	//	rb.setId(id);
		rb.setName(Name);
		rb.setAddress(Address);
		rb.setEmail(Email);
		rb.setContact(Contact);
		rb.setGender(Gender);
		rb.setCity(City);
		rb.setLanguage(Language);
		
		int status=ImplUser.update(id);
		System.out.println("status:"+status);
		if(status>0)
		{
        response.sendRedirect("Home.jsp");
        out.println("Record is Updated");
		}else{
			out.println("record is not updated");
		}
		
	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

	

	
