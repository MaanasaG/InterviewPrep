package com.org.strings;

public class RemoveReplaceDelete {
 
    public static void main(String[] args) {
        System.out.println("Output for replaceAllChar(): " + repalceAllChar("crunchify.co - Web Development", "e" , "*"));
        System.out.println("Output for deleteAllNonDigit(): " + deleteAllNonDigit("#21sadfs23$&%^(!9@!"));
        System.out.println("Output for replaceCharAt(): " + replaceCharAt("eBay Google Paypal", 10, '$'));
        System.out.println("Output for removeChar(): " + removeChar("eBay Google Paypal", 'a'));
        System.out.println("Output for removeCharAt(): " + removeCharAt("eBay Google Paypal", 5));
        String first="maanasa vamsi rianu vamsi";
		String second="vamsi";
		if(first.length()>second.length()){
            System.out.println(removetheFirstOccurenceinString(first,second));
            System.out.println(removetheAllOccurencesinString(first,second));

	    }
	    else{
		   System.out.println(removetheFirstOccurenceinString(second,first));
           System.out.println(removetheAllOccurencesinString(first,second));

	    }
       //converting char array to string
        char[] myString = new char[] {'T', 'H', 'I', 'S', ' ',  'I', 'S', ' ', 'T', 'E', 'S', 'T'};
        String output1 = new String(myString);
        System.out.println("output1 : " + output1);
 
        String output2 = String.valueOf(myString);
        System.out.println("\noutput2 : " + output2);
    }
 
    private static char[] removetheAllOccurencesinString(String first,
			String second) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String removetheFirstOccurenceinString(String first, String second) {
		StringBuffer output= new StringBuffer();
    	int beginIndex = first.indexOf(second);
    	int endIndex = first.indexOf(second)+second.length();
    	output.append(first.substring(0, beginIndex));
    	output.append(first.substring(endIndex));
		return output.toString();
	}

	private static String removeCharAt(String s, int i) {
        StringBuffer buf = new StringBuffer(s.length() -1);
        buf.append(s.substring(0, i)).append(s.substring(i+1));
        return buf.toString();
    }
 
    private static String removeChar(String s, char c) {
        StringBuffer buf = new StringBuffer(s.length());
        buf.setLength(s.length());
        int current = 0;
        for (int i=0; i<s.length(); i++){
            char cur = s.charAt(i);
            System.out.println("cur"+cur);
            if(cur != c) {
            	buf.setCharAt(current++, cur);
           
            };
        }
        return buf.toString();
    }
 
    private static String replaceCharAt(String s, int i, char c) {
        StringBuffer buf = new StringBuffer(s);
        buf.setCharAt(i, c);
        return buf.toString();
    }
 
    private static String deleteAllNonDigit(String s) {
        String temp = s.replaceAll("\\D", "");
        return temp;
    }
 
    public static String repalceAllChar(String s, String f, String r){
        String temp = s.replace(f ,r);
        return temp;
    }
    
    
}