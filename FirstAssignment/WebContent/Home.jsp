<!DOCTYPE html>
<html lang="en">
<head>
<title>Matrix Admin</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>
<body>
 <form>
<%@page import="dao.ImplUser,bean.UserBean,java.util.*,java.sql.*"%>
	 <h3><a href="NewUser.jsp" style="color:red">Add User</a></h3>
    <table align=center
 style="background-color: skyblue; margin-left:20px;margin-left: 20px;">
	<form align="right" type="submit" value="Logout" >Logout<a href="login.jsp"></a></form>
			
            <table border=1>
            <thead><tr>
		            <th>Id</th>
					<th>Name</th>
					<th>Address</th>
					<th>Email</th>
					<th>Contact</th>
					<th>Gender</th>
					<th>City</th>
					<th>Language</th>
					<th>Action</th>
                </tr>
               
              </thead>
               <%
           	
           		int status=1,p;
				ArrayList<UserBean> ls = ImplUser.show();
		      	System.out.println("from implUser data");
				for(UserBean users : ls)
				{
					p=users.getId();
					System.out.println("printl id"+p);
				%>
				

			<tr>
			
			   	<td><%=status++%></td>	
				<td><%=users.getName()%></td>
				<td><%=users.getAddress()%></td>
				<td><%=users.getEmail()%></td>
				<td><%=users.getContact()%></td>
				<td><%=users.getGender()%></td>
				<td><%=users.getCity()%></td>
				<td><%=users.getLanguage()%></td>
			<td>	
		
			  <a href="Delete?id=<%=p%>">Delete/</a>
			  
			  <a href="UserUpdate.jsp?id=<%=p%>">Update/</a>
			  <a href="AddNewUser"></a>
			  
			  
				<!--<a href='Delete?id="+user.getId()+"'>delete</a>-->
				<!--<a href='Update?id="+user.getId()+"'>update</a>-->
				<!--<input type="submit" value="Logout" />  -->
				
				
				<!-- <a <!--href="update?id=<%=p%>" onclick='javascript:windowsopen("update.jsp", "_blank", "height=600,width=500");' title='Pop Up'>Update</a>-->	
		
		          <%
		          } %>
		          </td>
		          </tr>
		         	</table>
		            </table>
		         	
		</form>        
		</body>
</html>
