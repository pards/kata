package com.craigpardey.peak;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class OneDimPeakFinderTest {

	@Test
	public void findPeakMiddle() {
		assertIndexOfPeak( 3, new int[]{1,2,3,4,3,2,1});
	}

	@Test
	public void findPeakStart() {
		assertIndexOfPeak( 0, new int[]{4,3,2,1});
	}

	@Test
	public void findPeakEnd() {
		assertIndexOfPeak( 3, new int[]{1,2,3,4});
	}
	
	@Test
	public void findPeakSingleElement() {
		assertIndexOfPeak( 0, new int[]{1});
	}
	
	private void assertIndexOfPeak( int expIdx, int[] arr) {
		OneDimPeakFinder finder = new OneDimPeakFinder();
		int idx = finder.indexOfPeak(arr);
		assertEquals( idx, expIdx);
	}
}
