package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Accounts")
public class Account implements Serializable {

	private static final long serialVersionUID = -2054386655979281969L;

	public static final String ROLE_MANAGER = "MANAGER";
	public static final String ROLE_EMPLOYEE = "EMPLOYEE";

	@Id
	@Column(name = "User_Name", length = 20, nullable = false)
	private String userName;

	@Column(name = "Encryted_Password", length = 128, nullable = false)
	private String encrytedPassword;

	@Column(name = "Active", length = 1, nullable = false)
	private boolean active;

	@Column(name = "User_Role", length = 20, nullable = false)
	private String userRole;



	@Column(name = "Name", length = 255, nullable = false)
	private String name;

	@Column(name = "Address", length = 255, nullable = false)
	private String Address;

	@Column(name = "Phone", length = 255, nullable = false)
	private String Phone;

	@Column(name = "Email", length = 255, nullable = false)
	private String Email;



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEncrytedPassword() {
		return encrytedPassword;
	}

	public void setEncrytedPassword(String encrytedPassword) {
		this.encrytedPassword = encrytedPassword;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "Account{" +
				"userName='" + userName + '\'' +
				", encrytedPassword='" + encrytedPassword + '\'' +
				", active=" + active +
				", userRole='" + userRole + '\'' +
				", name='" + name + '\'' +
				", Address='" + Address + '\'' +
				", Phone='" + Phone + '\'' +
				", Email='" + Email + '\'' +
				'}';
	}
}
