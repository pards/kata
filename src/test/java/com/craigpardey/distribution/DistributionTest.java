package com.craigpardey.distribution;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DistributionTest {
	
	Distribution fixture;

	@BeforeMethod
	public void setUp() {
		fixture = new Distribution();
	}
	
	@AfterMethod
	public void tearDown() {
		fixture = null;
	}
	
	@Test
	public void testParse() {
		String s = "01223334444566";
		Map<String, String> result = fixture.parse(s);
		Assert.assertNotNull(result);
		Assert.assertTrue( result.containsKey("0"));
		Assert.assertEquals("*", result.get("0"));
		Assert.assertEquals("**", result.get("2"));
	}

	@Test
	public void testParseNull() {
		Map<String, String> result = fixture.parse(null);
		Assert.assertNotNull(result);
	}

	@Test
	public void testOrder() {
		String s = "01223334444566";
		Map<String, String> result = fixture.parse(s);
		Set<String> keys = result.keySet();
		Iterator<String> iter = keys.iterator();
		int orderedKey = 0;
		while(iter.hasNext()){
			Assert.assertEquals(orderedKey++, Integer.parseInt(iter.next()));
		}
	}

	@Test
	public void testInitMap() {
		Map<String, String> map = fixture.initMap();
		Assert.assertEquals(10, map.size());
		Assert.assertEquals("", map.get("0"));
	}

	@Test
	public void testPrint() {
		fixture.doDistribution("01223334444566");
	}
}
