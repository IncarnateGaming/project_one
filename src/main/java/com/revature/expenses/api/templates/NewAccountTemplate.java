package com.revature.expenses.api.templates;

import java.io.Serializable;
import java.util.Objects;

public class NewAccountTemplate implements Serializable{
	private static final long serialVersionUID = 3462503508349154071L;
	private String username;
	private String password;
	private String email;
	public NewAccountTemplate() {
		super();
	}
	public NewAccountTemplate(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
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
	@Override
	public int hashCode() {
		return Objects.hash(email, password, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof NewAccountTemplate)) {
			return false;
		}
		NewAccountTemplate other = (NewAccountTemplate) obj;
		return Objects.equals(email, other.email) && Objects.equals(password, other.password)
				&& Objects.equals(username, other.username);
	}
	@Override
	public String toString() {
		return "NewAccountTemplate [username=" + username + ", password=" + password + ", email=" + email + "]";
	}
}
