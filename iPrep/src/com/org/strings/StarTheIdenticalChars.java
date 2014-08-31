package com.org.strings;

public class StarTheIdenticalChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "xxyy";
		System.out.println(starTheIdenticalChars(input));
		
	}

	private static String starTheIdenticalChars(String input) {
		char currentchar=input.charAt(0);
		StringBuilder output= new StringBuilder();
		output.append(currentchar);
		for(int i=1;i<input.length();i++){
			char nextchar= input.charAt(i);
			if(currentchar==nextchar){
				output.append("*");
			}
				output.append(nextchar);
				currentchar=nextchar;
		}
		return output.toString();
	}

}
