package com.example.demo.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class SignUp {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int LoginId;
	private String EmailId;
	private String Firstname;
	private String LastName;
	private String Password;
	private String Status;

	public int getLoginId() {
		return LoginId;
	}
	public void setLoginId(int LoginId) {
		this.LoginId = LoginId;
	}
	
	public String getFirstName() {
		return Firstname;
	}
	public void setFirstName(String Firstname) {
		this.Firstname = Firstname;
	}
	
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String EmailId) {
		this.EmailId = EmailId;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		this.Password = Password;
	}

	public SignUp(String FirstName, String Password, String EmailId,String LastName,String Status) {
		super();
		this.Firstname = FirstName;
		this.Password = Password;
		this.LastName=LastName;
		this.EmailId=EmailId;
		this.Status=Status;
	}
	public SignUp() {
		
	}

}
