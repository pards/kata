package com.craigpardey.reversearray;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArrayReverserTest {

	ArrayReverser fixture = null;
	
	@BeforeMethod
	public void setUp() {
		fixture = new ArrayReverser();
	}
	
	@AfterMethod
	public void tearDown () {
		fixture = null;
	}
	
	@Test
	public void testReverse() {
		Assert.assertNull(fixture.reverse(null));
		Assert.assertNotNull(fixture.reverse(new int[]{}));
		Assert.assertTrue(Arrays.equals(new int[]{1}, fixture.reverse(new int[]{1})));
		Assert.assertTrue(Arrays.equals(new int[]{2,1}, fixture.reverse(new int[]{1,2})));
		Assert.assertTrue(Arrays.equals(new int[]{3,2,1}, fixture.reverse(new int[]{1,2,3})));
		Assert.assertTrue(Arrays.equals(new int[]{4,3,2,1}, fixture.reverse(new int[]{1,2,3,4})));
		Assert.assertTrue(Arrays.equals(new int[]{5,4,3,2,1}, fixture.reverse(new int[]{1,2,3,4,5})));
	}
}
