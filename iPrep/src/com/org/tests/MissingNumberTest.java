package com.org.tests;


import static org.junit.Assert.*;

import org.junit.Test;

import com.org.numbers.MissingNumber;

public class MissingNumberTest {

	/*empty array
	 * 1number array
	 * max numbers array
	 * array with missing
	 * array without missing
	 * array of characters
	 * string.convert to int and pass
	 * negative numbers
	 * sorted and not sorted inputs
	 * null
	 * sql injection
	 */
	@Test
	public void test() {
		int n=10;	
		int[] list1={};
		int[] list2={0};
		int[] list3={1,2,3,4,5,7,8,9,10};
		int[] list4={1,2,3,4,5};
		int[] list5={1,2,3,4,5,6,7,8,9,10};
		int[] list6={1,2,3,4,5,6,7,8,9,10,11};
		int[] list7={0,1,2,3,4,5,6,7,8,9};
		int[] list8={1,2,3,4,5,7,8,9,3};
		int[] list9={1,2,3,4,5,6,7,8,9,-1};
		int[] list10={1,2,3,4,5,6,7,8,99};		
		MissingNumber.findMissingNumber(list1, n);//Unacceptble Input!
		MissingNumber.findMissingNumber(list2, n);//Unacceptble Input!
		MissingNumber.findMissingNumber(list3, n);//Missing Number is:6
		MissingNumber.findMissingNumber(list4, n);//Unacceptble Input!
		MissingNumber.findMissingNumber(list5, n);//Unacceptble Input!
		MissingNumber.findMissingNumber(list6, n);//Unacceptble Input!
		MissingNumber.findMissingNumber(list7, n);//Unacceptble Input!
		MissingNumber.findMissingNumber(list8, n);///Unacceptble Input!
		MissingNumber.findMissingNumber(list9, n);///Unacceptble Input!
		MissingNumber.findMissingNumber(list10, n);//Unacceptble Input!
	

	}

}
