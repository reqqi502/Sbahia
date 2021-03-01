package dao.DaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Database.DbConnect;
import Model.Utilisateur;
import dao.ILogin;

import javax.management.relation.Role;

public class LoginImp implements ILogin{
	Statement statement;
	public static int id_Session = 0;
	Connection con ;

	@Override
	public Utilisateur login(String email, String password ) throws ClassNotFoundException, SQLException {
		Utilisateur utilisateur = null;


		try {
			con = DbConnect.getConnect();
			String query = "SELECT * FROM public.users" ;
			PreparedStatement preparedStatement = con.prepareStatement( query );

			ResultSet rs = preparedStatement.executeQuery();
					while (rs.next()) {
						System.out.println(con);

						String em = rs.getString( 3).trim();
						String pass = rs.getString( 4).trim();
						String rule = rs.getString( 5 ).trim();
						System.out.println("email from : " + em);
						System.out.println("password from :" + pass);
						System.out.println("role from :" + rule);

						if (em.equals(email) && pass.equals(password) && rule.equals("admin")){
							utilisateur = new Utilisateur(email, password, rule);
							id_Session = (rs.getInt(1));
							System.out.println(rule);
							System.out.println("admiiiin truuue !!!");
							break;
						}

						else if (em.equals(email) && pass.equals(password) && rule.equals("Client")) {
							utilisateur = new Utilisateur(email, password, rule);

							id_Session = (rs.getInt(1));
							System.out.println("client thats truuue");
							Utilisateur pre = new Utilisateur();
							pre.setRole("Client");

							break;

						}
						else{
							System.out.println("thast not true in impl ?");
						}
					}

			/*	if (ow.equals(email)&& passs.equals(password) && "admin".equals(rs.getString( 5))) {

					utilisateur = new Utilisateur(rs.getInt(1), email, password, rs.getString(4),rs.getString(5));
					id_Session = (rs.getInt(1));
					System.out.println("you are loged  admiiin !!!! ");



				}
					else if (email.equals(ow) && password.equals(passs) && "client".equals(rs.getString( 5))) {
						utilisateur = new Utilisateur(rs.getInt(1), email, password, rs.getString(4),rs.getString(5));
						id_Session = (rs.getInt(1));
						System.out.println("you are loged like client !!!!");
					}
				else{

					System.out.println("thtas t mazing !!!!!!!!!!!!");
					System.out.println("isDbEmail " + ow + " == " + email + ow.equals(email));
					System.out.println("isDbPassword " + passs + " == " + password + passs.equals(password));
					System.out.println("lenght"+ email.length());
					System.out.println("lenght"+ password.length());
					System.out.println("lenght email db"+ow.length() );
					System.out.println("lenght password db "+ passs.length());


				}


			 */







		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("thtas nt maizing !!!!!!!!!");
		}

		return utilisateur;

	}

}
