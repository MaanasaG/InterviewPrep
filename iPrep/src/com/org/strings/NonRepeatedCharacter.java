package com.org.strings;



public class NonRepeatedCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String input="lovely";
       //System.out.println(input.trim());
      // System.out.print(nonDuplicateCharacter(input.trim()));
       System.out.print(StringCompression(input));
		
	}


	private static String StringCompression(String input) {
		int[] charcount = new int[256];
		StringBuffer output = new StringBuffer();
		for(int i=0;i<input.length();i++){
			charcount[input.charAt(i)]++;
		}
		for(int i=0;i<input.length();i++){
			if(charcount[input.charAt(i)]==1){
				output.append(input.charAt(i));
				//output.append(charcount[input.charAt(i)]);
			}
			
		}
		return output.toString();
	}


	private static char nonDuplicateCharacter(String input) {
		int[] charCount = new int[256];	
		int i;
		for(i=0;i<input.length();i++){		
		charCount[input.charAt(i)]++;	
		//System.out.println("------>"+input.charAt(i)+" - is: "+charCount[input.charAt(i)]);
		}//for 1
		for(i=0;i<input.length();i++){
			if(charCount[input.charAt(i)]==1){
				return input.charAt(i) ;
			}			
		}
		return 0;
	}
	
	private static String characterCount(String input) {
		String mystr="";
		char last =input.charAt(0);
		int count=1;
		for(int i=0;i<input.length();i++){	
			if(input.charAt(i)==last){
				count++;
			}
			else{
				mystr+=last+""+count;
				last=input.charAt(i);
				count=1;
			}
			
		}
		
		return mystr+last+count;
	}//me
	
	
}
