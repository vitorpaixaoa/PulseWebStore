package com.example.demo.form;

import com.example.demo.model.CustomerInfo;

public class CustomerForm {

	private String name;
	private String address;
	private String email;
	private String phone;

	private boolean isValid;

	public CustomerForm() {

	}

	public CustomerForm(CustomerInfo customerInfo) {
		if (customerInfo != null) {
			this.name = customerInfo.getName();
			this.address = customerInfo.getAddress();
			this.email = customerInfo.getEmail();
			this.phone = customerInfo.getPhone();

		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

}
