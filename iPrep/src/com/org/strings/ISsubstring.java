package com.org.strings;

public class ISsubstring {

	   public static void main(String[] args){   
		   String first="maanasa vamsi rianu blah blah and blah blah";
		   String second="blah blah";
		   if(first.length()>second.length()){
              System.out.println(checkSubstring(first,second));
		   }
		   else{
			   System.out.println(checkSubstring(second,first)); 
		   }
	   }
	   private static boolean checkSubstring(String first, String second) {
		System.out.println(first.indexOf(second));
		if(first.indexOf(second)!=-1){
			return true;
		}
		return false;	
	}
	
}
