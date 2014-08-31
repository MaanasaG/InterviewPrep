package com.org.strings;

public class RemoveSpecificCharcaters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 String first="maanasa vamsi rian";
		 String second="a";
		  if(first.length()>second.length()){
                System.out.println(removeSpecificCharacters(first,second));
		   }
		   else{
			   System.out.println(removeSpecificCharacters(second,first)); 
		   }

	}

	private static String removeSpecificCharacters(String first, String second) {
		char[] firstCharArray = first.toCharArray();
		char[] secondCharArray = second.toCharArray();
		StringBuffer sb = new StringBuffer();
		boolean[]  tempBoolean = new boolean[128];
		for(int i=0;i < secondCharArray.length;i++)
        {
            tempBoolean[secondCharArray[i]]=true;
        }
		for(int j=0;j < firstCharArray.length;j++)
        {
            if(!tempBoolean[firstCharArray[j]])
            {
            	sb.append(firstCharArray[j]);
            }
        }
		 return sb.toString();
	}

}
