package com.org.strings;

public class CreateSubstring {
   public static void main(String[] args){
	   String first="maanasa vamsi rianu blah blah and blah";
	   int begginingIndex=-1;
	   int endingIndex=10;

	   System.out.println("myFunction: "+createSubstring(first,begginingIndex));
	  // System.out.println("SystemFunction: "+first.substring(-1));

	   System.out.println("myFunction: "+createSubstring(first,begginingIndex, endingIndex));
	  // System.out.println("SystemFunction: "+first.substring(4, 10));

   }

private static String createSubstring(String first, int begginingIndex,
		int endingIndex) {
	StringBuffer output= new StringBuffer();
	if(begginingIndex>=0&endingIndex>=0){	
	for(int i=begginingIndex;i<endingIndex;i++){
		output.append(first.charAt(i));	
	}
	}
	else{
		System.out.println("Please enter valid index");
	}
	return output.toString();
}

private static String createSubstring(String first, int index) {
	StringBuffer output= new StringBuffer();
	if(index>=0){	
	for(int i=index;i<first.length();i++){
	output.append(first.charAt(i));
	}
	}
	else{
		System.out.println("Please enter valid index");
	}
	return output.toString();
}

}
