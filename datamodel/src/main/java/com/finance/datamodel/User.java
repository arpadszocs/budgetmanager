package com.finance.datamodel;

public class User {
	private final int Id;

	private final String name;

	private final String email;

	public User(final int Id, final String name, final String email) {
		super();
		this.Id = Id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return this.Id;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

}
