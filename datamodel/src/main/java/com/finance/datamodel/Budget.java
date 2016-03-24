package com.finance.datamodel;

import java.util.List;

public class Budget {

	private final List<Amount> amountList;

	private final String name;

	public Budget(final String name, final List<Amount> amountList) {
		super();
		this.name = name;
		this.amountList = amountList;
	}

	public String getName() {
		return this.name;
	}

	public Money getCurrentAmount() {
		final Money money = Money.MONEY0;
		for (final Amount amount : this.amountList) {
			money.plus(amount.getMoney());
		}
		return money;
	}

}
