package dao;

import java.sql.SQLException;

import Model.Utilisateur;

public interface ILogin {

	public  Utilisateur login(String email, String password )throws ClassNotFoundException, SQLException;

}
