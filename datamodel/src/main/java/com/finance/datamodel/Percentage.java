package com.finance.datamodel;

public class Percentage {
	private final double actual;
	private final double planned;

	public Percentage(final double actual, final double planned) {
		super();
		this.actual = actual;
		this.planned = planned;
	}

	public double asFactor() {
		return this.asValue() / 100;
	}

	public double asValue() {
		return this.actual * 100 / this.planned;

	}

}
