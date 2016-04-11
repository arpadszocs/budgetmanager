package com.finance.datamodel;

import java.util.Map;

public class Account {
	private final Map<String, Amount> amountMap;

	private final String name;

	private final String IBAN;

	public Account(final Map<String, Amount> amountMap, final String name, final String IBAN) {
		super();
		this.amountMap = amountMap;
		this.name = name;
		this.IBAN = IBAN;
	}

	public String getName() {
		return this.name;
	}

	public String getIBAN() {
		return this.IBAN;
	}

	public void add(final Amount amount) {
		final String budgetName = amount.getBudgetName();
		final Amount previousAmount = this.amountMap.get(budgetName);
		if (previousAmount == null) {
			this.amountMap.put(budgetName, amount);
		}
		previousAmount.getMoney().plus(amount.getMoney());
	}

	public void remove(final Amount amount) {
		final String budgetName = amount.getBudgetName();
		final Amount previousAmount = this.amountMap.get(budgetName);
		if (previousAmount != null) {
			previousAmount.getMoney().minus(amount.getMoney());
		}
		// TODO:tbd
	}

}
