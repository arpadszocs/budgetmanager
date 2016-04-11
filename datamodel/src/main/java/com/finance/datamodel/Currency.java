package com.finance.datamodel;

public enum Currency {

	EUR("EUR"), DOLLAR("DOLLAR"), RON("RON");

	private String value;

	private Currency(final String currency) {
		this.value = currency;
	}

	public String getValue() {
		return this.value;
	}

}
