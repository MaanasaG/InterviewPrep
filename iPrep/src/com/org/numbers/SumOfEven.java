package com.org.numbers;

public class SumOfEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 18;
		System.out.println(sumOfEven(n));
	}

	private static int sumOfEven(int n) {
		int sum=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				sum=sum+i;
			}
			
		}
		return sum;
	}

}
