package com.finance.datamodel;

public class Amount {

	private final Budget budget;

	private final Account account;

	private final Money money;

	public Amount(final Budget budget, final Account account, final Money money) {
		super();
		this.budget = budget;
		this.account = account;
		this.money = money;
	}

	public Money getMoney() {
		return this.money;
	}

	public Budget getBudget() {
		return this.budget;
	}

	public Account getAccount() {
		return this.account;
	}

}
