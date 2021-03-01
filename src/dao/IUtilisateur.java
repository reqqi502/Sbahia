package dao;

import java.sql.SQLException;

import Model.Utilisateur;

public interface IUtilisateur {

	
	public Utilisateur Register(String username, String password, String email) throws ClassNotFoundException, SQLException;

}
