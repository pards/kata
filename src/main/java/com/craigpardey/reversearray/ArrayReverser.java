package com.craigpardey.reversearray;

import java.util.Arrays;

public class ArrayReverser {

	public int[] reverse(int[] array) {
		if( array == null) return null;
		int tmp;
		for( int i = 0; i < array.length / 2; i++){
			int endIdx = array.length - 1 - i;

			tmp = array[i];
			array[i] = array[ endIdx];
			array[ endIdx] = tmp;
		}
		System.out.println(Arrays.toString(array));
		return array;
	}
}
