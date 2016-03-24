package com.finance.datamodel;

public class Money {

	private static final String DEFAULT_CURRENCY = "EUR";
	public static final Money MONEY0 = new Money(0D, DEFAULT_CURRENCY);
	private Double amount;
	// TODO: create enums instead
	private final String currency;

	public Money(final Double amount, final String currency) {
		super();
		this.amount = amount;
		this.currency = currency;
	}

	public Double getAmount() {
		return this.amount;
	}

	public String getCurrency() {
		return this.currency;
	}

	public Money plus(final Money money) {
		if (money == null) {
			return this;
		}
		if (this.currency.equals(money.getCurrency())) {
			this.amount += money.amount;
		}
		return this;
	}
}
