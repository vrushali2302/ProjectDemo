package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import bean.UserBean;
import dbconnection.DBConnection;


public class ImplUser
{
	
	//private static final String Name= null;
	static PreparedStatement ps;
	static int status=0;

	//Insert function()
			public static int insert(UserBean rb)
			{

				System.out.println("in insert function before");
			
				try {
					
					System.out.println("Insert data suceesfully");

					ps = DBConnection.getConnection().prepareStatement("insert into userdetails(Name,Address,Email,Contact,Gender,City,Language) values (?,?,?,?,?,?,?);");
					
					System.out.println("hiiiiiiii");
					
					ps.setString(1,rb.getName());
					ps.setString(2,rb.getAddress());
					ps.setString(3,rb.getEmail());
					ps.setString(4,rb.getContact());
					ps.setString(5,rb.getGender());
					ps.setString(6,rb.getCity());
					ps.setString(7,rb.getLanguage());
					
					status = ps.executeUpdate();
					
				}catch(Exception e) 
				{
					e.printStackTrace();
				}
				return status;
			}
	
			
			//update 
			public static int update(int id)
			{
				int status=0;
				System.out.println("in update query");
				try
				{
					
					String s= "update userdetails set Name=?,Address=?,Email=?,Contact=?,Gender=?,City=?,Language=? where id=" +id;
					
				ps=DBConnection.getConnection().prepareStatement(s);
				status = ps.executeUpdate();

					UserBean rb=new UserBean();

					ps.setString(1,rb.getName());
					ps.setString(2,rb.getAddress());
					ps.setString(3,rb.getEmail());
					ps.setString(4,rb.getContact());
					ps.setString(5,rb.getGender());
					ps.setString(6,rb.getCity());
					ps.setString(7,rb.getLanguage());
					
					
					System.out.println("sucessfully updated");

			//	System.out.println(""+r.getGender());
				}
				catch(Exception e)
				{
					//System.out.println("in catch statement");
					e.printStackTrace();
				}
				return status;
		
			}
			
			//Delete
			public static int delete(int id)
			{ 
				
				System.out.println("in delete function");
				try 
				{
					String s="delete from userdetails where id="+id;
					ps =DBConnection.getConnection().prepareStatement(s);
					status=ps.executeUpdate();

					System.out.println("after delete query execution");
				} catch (Exception e)
				{
					//System.out.println("in catch()");
					e.printStackTrace();
				}
				
				return status;
				
			}
			//select by id
			public static List<UserBean> getSuppByID(int id)
			{
				List<UserBean> list=new ArrayList<UserBean>();
				//Connection con=DBConnection.getConnection();
				try
				{
					
					PreparedStatement ps=DBConnection.getConnection().prepareStatement("select * from userdetails where id="+id);
					ResultSet rs=ps.executeQuery(); 
					while(rs.next())
					{
						UserBean s=new UserBean();
						s.setName(rs.getString("Name"));
						s.setAddress(rs.getString("Address"));
						s.setEmail(rs.getString("Email"));
						s.setContact(rs.getString("Contact"));
						s.setGender(rs.getString("Gender"));
						s.setCity(rs.getString("City"));
						s.setLanguage(rs.getString("Language"));
						list.add(s);
						
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();

				}
				return list;
			}
	
			
			//select
			public static ArrayList<UserBean> show()
			{
		          System.out.println("from table tab");

				ArrayList<UserBean> ls = new ArrayList<UserBean>();
				
				try 
				{
					System.out.println("select try");
					ps =DBConnection.getConnection().prepareStatement("select * from userdetails");
					ResultSet rt = ps.executeQuery();
					System.out.println("select executed");
					while(rt.next())
					{
						UserBean rb = new UserBean();
						rb.setId(rt.getInt("id"));
						rb.setName(rt.getString("Name"));
						rb.setAddress(rt.getString("Address"));
						rb.setEmail(rt.getString("Email"));
						rb.setContact(rt.getString("Contact"));
						rb.setGender(rt.getString("Gender"));
						rb.setCity(rt.getString("City"));
						rb.setLanguage(rt.getString("Language"));
						ls.add(rb);

					}
					System.out.println("all data select ");

				}
				catch (SQLException e) 
				{
					System.out.println("select catch");
					e.printStackTrace();
				}
				return ls ;
				
			}
		
}	
	
