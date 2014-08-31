import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class SkypePbm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String input="Maanasa";
       System.out.println(input.trim());
       System.out.print(nonDuplicateCharacter(input.trim()));
       System.out.print(StringCompression(input));
		
	}

	private static char nonDuplicateCharacter(String input) {
		int[] charCount = new int[256];	
		int i;
		System.out.println(charCount['m']);
		for(i=0;i<input.length();i++){		
		charCount[input.charAt(i)]++;	
		System.out.println("------>"+input.charAt(i)+" - is: "+charCount[input.charAt(i)]);
		}//for 1
		for(i=0;i<input.length();i++){
			if(charCount[input.charAt(i)]==1){
				return input.charAt(i) ;
			}
			else{
				return 'N';
			}
			//if	
		}//for 2
		return 0;
	}//method	
	
	private static String StringCompression(String input) {
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
	
	/*private static String StringCompression(String input) {
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
	 * 
	 * 
	 * 
	 */
}
