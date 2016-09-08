package org.rmi.server.model;

import java.io.Serializable;

public class User implements Serializable, Cloneable {

	private static final long serialVersionUID = 6910584263183142037L;

	private String name;

	private String password;

	public User() {
		super();
	}

	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
