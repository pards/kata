package com.craigpardey.peak;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class OneDimPeakFinder {

	private static final Logger LOGGER = LoggerFactory.getLogger(OneDimPeakFinder.class);
	
	public int indexOfPeak(int[] arr) {
		return indexOfPeak(arr, 0, arr.length);
	}
	
	public int indexOfPeak(int[] arr, int beginIdx, int endIdx) {
		int i = (endIdx - beginIdx)/2 + beginIdx;
		LOGGER.debug("Checking idx {} in {}", i, Arrays.toString(arr));

		if( (endIdx - beginIdx == 1) || ( arr[i] >= arr[i-1] && arr[i] >= arr[i+1])) {
			LOGGER.debug("Found peak at idx {} in {}", i, Arrays.toString(arr));
			return i;
		}
		else if( arr[i-1] >= arr[i]) {
			return indexOfPeak( arr, 0, i);
		}
		else if( arr[i+1] >= arr[i]) {
			return indexOfPeak( arr, i+1, arr.length);
		}
		return -1;
	}
}
