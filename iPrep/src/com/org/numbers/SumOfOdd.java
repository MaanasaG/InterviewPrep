package com.org.numbers;

public class SumOfOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 18;
		System.out.println(sumOfOdd(n));
	}

	private static int sumOfOdd(int n) {
		int sum=0;
		for(int i=1;i<=n;i++){
			if(i%2!=0){
				sum=sum+i;
			}
			
		}
		return sum;
	}
}
