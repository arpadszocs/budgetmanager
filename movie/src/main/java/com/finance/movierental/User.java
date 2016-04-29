package com.finance.movierental;

public class User implements Comparable<User> {
	private final Integer Id;

	private final String name;

	private final String email;

	private final String password;

	private final String role;

	public User(final Integer id, final String name, final String email, final String password, final String role) {
		super();
		this.Id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public Integer getId() {
		return this.Id;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPassword() {
		return this.password;
	}

	public String getRole() {
		return this.role;
	}

	@Override
	public int compareTo(final User user) {
		return this.getName().compareTo(user.getName());
	}

}
