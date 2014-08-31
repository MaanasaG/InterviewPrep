package com.org.strings;

public class StringReversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(reserveWords("Skype is a collaborative tool"));
		System.out.println(reverseOnlyWOrds("Skype is a collaborative tool"));

	}
	private static String reserveWords(String string) {
		String[] result =string.split(" ");
		String output="";
		for(int i=result.length-1;i>=0;i--){
			output=output+result[i]+" ";
		}
		
		return output.trim();
	}
	public static String reverseOnlyWOrds(String input){
		String[] temp=input.split(" ");
		StringBuffer output = new StringBuffer();
		for(int i=temp.length-1;i>=0;i--){
			output.append(temp[i]);		
			output.append(" ");		
		}
		return output.toString();
		
	}
	public static String stringReverse(String input){
		String output=new StringBuffer(input).reverse().toString()	;
	    System.out.println(output);
		return output ;
		
	}
}
