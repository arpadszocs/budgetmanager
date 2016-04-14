
package com.finance.datamodel;

public class Plan {
	private final Amount planned;
	private final Budget actual;

	public Plan(final Amount planned, final Budget actual) {
		super();
		this.planned = planned;
		this.actual = actual;
	}

	public double getDifferenceInAmount() {
		final double planned = this.planned.getMoney().getAmount();
		final double actual = this.actual.getCurrentAmount().getAmount();
		return planned - actual;
	}

	public Percentage getDifferenceInPercentage() {
		return new Percentage(this.actual.getCurrentAmount().getAmount(), this.planned.getMoney().getAmount());
	}

	public Amount getPlanned() {
		return this.planned;
	}

	public Budget getActual() {
		return this.actual;
	}

}
