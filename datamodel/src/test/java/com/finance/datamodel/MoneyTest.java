package com.finance.datamodel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testPlusSameCurrency() {
		final Money ping = new Money(6.24, "EUR");
		final Money pong = new Money(4.15, "EUR");

		ping.plus(pong);

		assertThat(ping.getAmount(), is(10.39));
	}

	@Test
	public void testPlusDifferentCurrency() {
		final Money ping = new Money(6.24, "EUR");
		final Money pong = new Money(4.15, "RON");

		ping.plus(pong);

		assertThat(ping.getAmount(), is(6.24));

	}

}
