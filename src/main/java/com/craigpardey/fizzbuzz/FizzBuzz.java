package com.craigpardey.fizzbuzz;

import java.util.Arrays;

public class FizzBuzz {

	private static final String BUZZ = "Buzz";
	private static final String FIZZ = "Fizz";
	private static final String FIZZ_BUZZ = FIZZ + BUZZ;

	public static void main(String args[]){
		FizzBuzz fizzBuzz = new FizzBuzz();
		System.out.println(Arrays.toString(fizzBuzz.getFizzBuzz()));
	}
	
	public String[] getFizzBuzz(){
		int max = 100;
		String[] result = new String[max];
		for(int i = 0; i < max; i++){
			result[i] = translate(i+1);
		}
		return result;
	}
	
	public String translate(int i) {
		if(isFizz(i) && isBuzz(i)){
			return FIZZ_BUZZ;
		}
		else if(isFizz(i)){
			return FIZZ;
		}
		else if(isBuzz(i)){
			return BUZZ;
		}
		return Integer.toString(i);
	}
	
	boolean isFizz(int i) {
		return i % 3 == 0;
	}
	
	boolean isBuzz(int i) {
		return i % 5 == 0;
	}
}
