package Model;

import java.io.Serializable;

public class Utilisateur  implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private	String username;
	private String password;
	private String email;
	private String role;

	public  Utilisateur() {
		this.role = getRole();
		this.id = getId();
		this.username = getUsername();
		this.email = getEmail();
		this.password = getPassword();
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public  String getRole() { return role; }
	public void setRole(String role) {
		this.role = role;
	}
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Utilisateur( String password, String email,String role ) {
		super();

		this.password = password;
		this.email = email;
		this.role = role;

	}
	   public Utilisateur(int anInt, String email, String password, String string, String rsString) {
				super();
				// TODO Auto-generated constructor stub
			}
			@Override
			public String toString() {
				return "Utilisateur [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
						+ ", role=" + role + "]";
			}


		}
