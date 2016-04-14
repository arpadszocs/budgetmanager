package com.finance.datamodel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PercentageTest {

	@Test
	public void testPercentageAsValue() {
		final Percentage percentage = new Percentage(100, 200);

		assertThat(percentage.asValue(), is(50D));
	}

	@Test
	public void testPercentageAsFactor() {
		final Percentage percentage = new Percentage(100, 200);

		assertThat(percentage.asFactor(), is(0.50));

	}

}
