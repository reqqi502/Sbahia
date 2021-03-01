package web;

import java.io.IOException;
import java.sql.SQLException;
import javax.management.relation.Role;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Model.Utilisateur;
import dao.ILogin;
import dao.DaoImp.LoginImp;
import javax.management.relation.Role;
import dao.IUtilisateur;



		/**
		 *  Servlet implementation class LoginServlet
		 */


		@WebServlet("/login")
		public class ServletLogin extends HttpServlet {
			private static final long serialVersionUID = 1L;
			private ILogin utilisateur;
			private Object Role;

			public void init() throws ServletException {
				utilisateur = new LoginImp();
			}


			public ServletLogin() {
				super();
				// TODO Auto-generated constructor stub
			}

			protected void doPost(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {


				System.out.println("ffffffffffffffffffffffffffffffffffffffffffffffffffffffhhhhhhhhh");
				String email = request.getParameter( "email" );
				String password = request.getParameter( "password" );
				HttpSession httpsession = request.getSession();

				LoginImp lo =  new LoginImp();
				try {
					Utilisateur ps = lo.login( email, password );
					System.out.println( "pre" + email );
					System.out.println( "pre" + password );


					String roles = ps.getRole();


					if (ps != null) {
						if (ps.getRole().equals( "Client" )) {
							httpsession.setAttribute( "utilisateur", ps );
							System.out.println( "u are loged like client !!!!!!!" );
							response.sendRedirect( "index.jsp" );
						} else if (ps.getRole().equals( "admin" )) {
							System.out.println( "you are loged like admin !!!!!!!!!!!!" );
							response.sendRedirect( "admin.jsp" );
						}else{
							System.out.println("servlet nooot true ?");
						}
					}else {
						System.out.println("elsssssssssssssse");
					}

				} catch (ClassNotFoundException | SQLException e) {
					System.out.println(e.getMessage());
					System.out.println("fffffffffffffffffffffffffffffffffffff");
				}
			}




	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);

	}

}
