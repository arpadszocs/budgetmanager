package com.finance.datamodel;

import static com.finance.datamodel.Currency.EUR;
import static com.finance.datamodel.Currency.RON;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testPlusSameCurrency() {
		final Money ping = new Money(6.24, EUR);
		final Money pong = new Money(4.15, EUR);

		ping.plus(pong);

		assertThat(ping.getAmount(), is(10.39));
	}

	@Test
	public void testPlusDifferentCurrency() {
		final Money ping = new Money(6.24, EUR);
		final Money pong = new Money(4.15, RON);

		ping.plus(pong);

		assertThat(ping.getAmount(), is(6.24));

	}

	@Test
	public void testMinusSameCurrency() {
		final Money ping = new Money(6.24, EUR);
		final Money pong = new Money(4.15, EUR);

		ping.minus(pong);

		assertThat(ping.getAmount(), is(2.09));
	}

	@Test
	public void testMinusDifferentCurrency() {
		final Money ping = new Money(6.24, EUR);
		final Money pong = new Money(4.15, RON);

		ping.minus(pong);

		assertThat(ping.getAmount(), is(6.24));

	}

	@Test
	public void testMinusNegativeValue() {
		final Money ping = new Money(4.15, EUR);
		final Money pong = new Money(6.24, EUR);

		ping.minus(pong);

		assertThat(ping.getAmount(), is(-2.09));

	}

}
