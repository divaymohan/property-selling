package com.registerlogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlinepropertysell.pojos.userPOJO;
import com.onlineproperty.DAOS.userDAO;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
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
		String email = request.getParameter("email_id").toString();
		String password = request.getParameter("password").toString();
		userDAO userdao;
		userPOJO user;
		try {
			userdao = new userDAO();
			user = userdao.getUser(email);
			System.out.println(email);
			System.out.println(user.getUserEmail());
			if(email.equals(user.getUserEmail()) && password.equals(user.getPassword())){
				
				HttpSession session = request.getSession();
				session.setAttribute("userName", user.getUserName());
				session.setAttribute("userId", user.getUserId());
				session.setAttribute("userEmail", user.getUserEmail());
				
				response.sendRedirect("index.jsp");
				
			}
			else{
				response.sendRedirect("login.html");
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
