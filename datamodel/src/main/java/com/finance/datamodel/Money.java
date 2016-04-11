package com.finance.datamodel;

public class Money {

	private static final Currency DEFAULT_CURRENCY = Currency.EUR;
	public static final Money MONEY0 = new Money(0D, DEFAULT_CURRENCY);
	private Double amount;
	private final Currency currency;

	public Money(final Double amount, final Currency currency) {
		super();
		this.amount = amount;
		this.currency = currency;
	}

	public Double getAmount() {
		return this.amount;
	}

	public Currency getCurrency() {
		return this.currency;
	}

	public Money plus(final Money money) {
		if (money == null) {
			return this;
		}
		if (this.currency == money.getCurrency()) {
			this.amount += money.amount;
		}
		return this;
	}

	public Money minus(final Money money) {
		if (money == null) {
			return this;
		}
		if (this.currency == money.getCurrency()) {
			this.amount -= money.amount;
		}
		return this;
	}
}
