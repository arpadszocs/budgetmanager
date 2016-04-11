package com.finance.datamodel;

import java.util.Map;

public class Budget {

	private final Map<String, Amount> amountMap;

	private final String name;

	public Budget(final String name, final Map<String, Amount> amountMap) {
		super();
		this.name = name;
		this.amountMap = amountMap;
	}

	public String getName() {
		return this.name;
	}

	public Money getCurrentAmount() {
		final Money money = Money.MONEY0;
		for (final Amount amount : this.amountMap.values()) {
			money.plus(amount.getMoney());
		}
		return money;
	}

	public void add(final Amount amount) {
		final String IBAN = amount.getAccountIBAN();
		final Amount previousAmount = this.amountMap.get(IBAN);
		if (previousAmount == null) {
			this.amountMap.put(IBAN, amount);
		}
		previousAmount.getMoney().plus(amount.getMoney());
	}

	public void remove(final Amount amount) {
		final String IBAN = amount.getAccountIBAN();
		final Amount previousAmount = this.amountMap.get(IBAN);
		if (previousAmount != null) {
			previousAmount.getMoney().minus(amount.getMoney());
		}
		// TODO:tbd
	}

}
