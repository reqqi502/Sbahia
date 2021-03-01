package dao.DaoImp;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import Database.DbConnect;
import Model.Utilisateur;
import dao.IUtilisateur;


import javax.management.relation.Role;

public class UtilisateurImp implements IUtilisateur {

	@Override
	public Utilisateur Register(String username, String password, String email)
			throws ClassNotFoundException, SQLException {
		Utilisateur user = null;
		String reqwa ="INSERT INTO public.users( fullname, email, password, role) VALUES ( ?, ?, ?, ?);";
		PreparedStatement statement = DbConnect.getConnect().prepareStatement(reqwa);

		statement.setString(1, username);
		statement.setString(2, email);
		statement.setString(3, password);
		statement.setString(4, "Client");
		statement.executeUpdate();
		
		user = new Utilisateur(username, password, email );
		
		return user;
	}

}
