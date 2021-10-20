package com.pb.cucumbertest.stepdefinitions;

public class Credentials {

	public String username;
	public String password;

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public Credentials(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public void setMyCredentials(String username, String password) {
		this.username = username;
		this.password = password;

	}

}
