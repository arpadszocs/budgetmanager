package com.finance.datamodel;

import java.util.List;

public class Account {
	private final List<Amount> amountList;

	private final String name;

	public Account(final List<Amount> amountList, final String name) {
		super();
		this.amountList = amountList;
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
