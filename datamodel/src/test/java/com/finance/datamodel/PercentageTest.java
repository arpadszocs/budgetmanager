package com.finance.datamodel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PercentageTest {

	@Test
	public void testPercentageAsValue() {
		final Percentage percentage = new Percentage(80);

		assertThat(percentage.asValue(), is(80D));
	}

	@Test
	public void testPercentageAsFactor() {
		final Percentage percentage = new Percentage(50);

		assertThat(percentage.asFactor(), is(0.5));

	}

}
