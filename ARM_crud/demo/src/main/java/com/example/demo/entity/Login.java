package com.example.demo.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Login {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int LoginId;
	private String LoginName;
	private String LoginPassword;
	
	public int getLoginId() {
		return LoginId;
	}
	public void setLoginId(int LoginId) {
		this.LoginId = LoginId;
	}
	public String getLoginName() {
		return LoginName;
	}
	public void setLoginName(String LoginName) {
		this.LoginName = LoginName;
	}
	public String getLoginPassword() {
		return LoginPassword;
	}
	public void setLoginPassword(String LoginPassword) {
		this.LoginPassword = LoginPassword;
	}

	public Login(int LoginId, String LoginName, String LoginPassword) {
		super();
		this.LoginId = LoginId;
		this.LoginName = LoginName;
		this.LoginPassword = LoginPassword;
	}
	public Login() {

	}
}
