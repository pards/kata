package com.craigpardey.fizzbuzz;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FizzBuzzTest {

	FizzBuzz fixture;
	
	@BeforeMethod
	public void setUp(){
		fixture = new FizzBuzz();
	}
	
	@AfterMethod
	public void tearDown() {
		fixture = null;
	}
	
	@Test
	public void testIsFizz() {
		Assert.assertFalse(fixture.isFizz(1));
		Assert.assertTrue(fixture.isFizz(3));
		Assert.assertFalse(fixture.isFizz(5));
		Assert.assertTrue(fixture.isFizz(6));
		Assert.assertTrue(fixture.isFizz(15));
	}
	
	@Test
	public void testIsBuzz() {
		Assert.assertFalse(fixture.isBuzz(1));
		Assert.assertFalse(fixture.isBuzz(3));
		Assert.assertTrue(fixture.isBuzz(5));
		Assert.assertFalse(fixture.isBuzz(6));
		Assert.assertTrue(fixture.isBuzz(15));
	}
	
	@Test
	public void testTranslate() {
		Assert.assertEquals("1", fixture.translate(1));
		Assert.assertEquals("Fizz", fixture.translate(3));
		Assert.assertEquals("Buzz", fixture.translate(5));
		Assert.assertEquals("FizzBuzz", fixture.translate(15));
	}

	@Test
	public void testGetFizzBuzz() {
		String[] fizzBuzz = fixture.getFizzBuzz();
		Assert.assertNotNull(fizzBuzz);
		Assert.assertEquals(100, fizzBuzz.length);
		int i = 0;
		Assert.assertEquals("1", fizzBuzz[i++]);
		Assert.assertEquals("2", fizzBuzz[i++]);
		Assert.assertEquals("Fizz", fizzBuzz[i++]);
		Assert.assertEquals("4", fizzBuzz[i++]);
		Assert.assertEquals("Buzz", fizzBuzz[i++]);
		Assert.assertEquals("Fizz", fizzBuzz[i++]);
		Assert.assertEquals("7", fizzBuzz[i++]);
		Assert.assertEquals("8", fizzBuzz[i++]);
		Assert.assertEquals("Fizz", fizzBuzz[i++]);
		Assert.assertEquals("Buzz", fizzBuzz[i++]);
		Assert.assertEquals("11", fizzBuzz[i++]);
		Assert.assertEquals("Fizz", fizzBuzz[i++]);
		Assert.assertEquals("13", fizzBuzz[i++]);
		Assert.assertEquals("14", fizzBuzz[i++]);
		Assert.assertEquals("FizzBuzz", fizzBuzz[i++]);
		Assert.assertEquals("16", fizzBuzz[i++]);
		Assert.assertEquals("17", fizzBuzz[i++]);
		Assert.assertEquals("Fizz", fizzBuzz[i++]);
		Assert.assertEquals("19", fizzBuzz[i++]);
		Assert.assertEquals("Buzz", fizzBuzz[i++]);
	}
}
