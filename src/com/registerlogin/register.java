package com.registerlogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineproperty.DAOS.userDAO;
import com.onlinepropertysell.pojos.userPOJO;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int var = 0;
		//String first_name = request.getParameter("first_name").toString();
		String last_name = request.getParameter("last_name").toString();
		String email = request.getParameter("email_id").toString();
		String mobilenumber = request.getParameter("mobile_number").toString();
		//String gender = request.getParameter("gender").toString();
		String password = request.getParameter("password").toString();
		String password1 = request.getParameter("rpassword").toString();
		userPOJO userpojo = new userPOJO(0, "", "","","");
		userDAO ud = null;
		try {
			ud = new userDAO();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(password.equals(password1)){
			userpojo.setUserName(last_name);
			userpojo.setPhoneNumber(mobilenumber);
			userpojo.setUserEmail(email);
			userpojo.setPassword(password);
		}
		try {
			var = ud.insert(userpojo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//String repeatPassword = request.getParameter("repeat_password").toString();
		
		
		if(var==1){
			HttpSession session = request.getSession();
			session.setAttribute("userName",last_name);
			response.sendRedirect("index.jsp");
		}
		else{
			response.sendRedirect("signup.html");
		}
//		PrintWriter out = response.getWriter();
//		out.println("Your Have Entered Data :: ");
//		//out.println("firstName: " + first_name);
//		out.println("lastName: " + last_name);
//		out.println("email: " + email);
//		out.println("Mobile Number: " + mobilenumber);
//		//out.println("Gender: " + gender);
//		out.println("password: " + password);
//		out.println("password: " + var);
//		//out.println("RepeatPassword: " + repeatPassword);
	}

}
