package action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.UserBean;
import dao.ImplUser;


@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Delete() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
    	System.out.println("In Delete_servlet");
		try {
			String id1 = request.getParameter("id");
			int id = Integer.parseInt(id1);
			
			
			
		//	UserBean rb = new UserBean();
			System.out.println("in bean class");
		//	rb.setId(id);
			
			//.out.println("id");
			int status =ImplUser.delete(id);
			//response.sendRedirect("Home.jsp");

			System.out.println("Status:"+status);
			System.out.println("After the delete()");
			if(status>0)
			{
					System.out.println("deleted successfully");
					response.sendRedirect("Home.jsp");

			}
			else
			{
				System.out.println("Data is not deleted");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
    
    
    
    
    
    
    
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		}


    
/*String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        EmpDao.delete(id);  
        response.sendRedirect("ViewServlet");  */
	}
