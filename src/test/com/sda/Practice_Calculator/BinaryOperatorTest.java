package com.sda.Practice_Calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by andrzej on 03.07.17.
 */
public class BinaryOperatorTest {


private MathCalc mathCalc = new MathCalc();

	@Before
	public void setUp() {

	}

	@Test
	public void shouldStart() {

	}

	@Test
	public void addShouldReturnAddedValue() {

		int actual = mathCalc.ADD.calculate(3,4);

		Assert.assertEquals(7,actual);
	}

	@Test
	public void substractShouldReturnProperValue() {

		int expected = mathCalc.SUBSTRACT.calculate(10,3);

		Assert.assertEquals(7,expected);

	}

	@Test
	public void multiplyShouldReturnProperValue() {
		int expected = mathCalc.MULTIPLY.calculate(5,5);

		Assert.assertEquals(25,expected);
	}

	@Test
	public void divideShouldReturnProperValue() {
		int expected = mathCalc.DIVIDE.calculate(10,5);

		Assert.assertEquals(2,expected);
	}

	@Test
	public void divideShouldReturnExceptionWhen0() {
		int a = 10;
		int b = 0;

		try {
			mathCalc.DIVIDE.calculate(a, b);
			Assert.fail();
		} catch (IllegalArgumentException e) {

		}

	}

}