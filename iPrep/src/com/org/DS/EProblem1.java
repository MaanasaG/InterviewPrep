package com.org.DS;


public class EProblem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=10;
		eProblem1(n);
	}

	public static void eProblem1(int n){
		int Sum=0, i=0, j=0;
		if(n!=0&n>0){
	    for(i=0;i<=n;i++){
	        if (i%3==0 && i<=n)
	            Sum=Sum+i;}
	    for(j=0;j<=n;j++){
	        if (j%5==0 && j<n && j*5%3!=0)
	            Sum=Sum+j;
	    }
	    System.out.println("The Sum is "+Sum);
	}
	
	else{
		System.out.println("Invalid input ");
	}
	}
}
