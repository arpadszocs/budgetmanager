package com.finance.datamodel;

public class Percentage {
	private final double percentage;

	public Percentage(final double percentage) {
		super();
		this.percentage = percentage;
	}

	public double asFactor() {
		return this.percentage / 100;
	}

	public double asValue() {
		return this.percentage;

	}

}
