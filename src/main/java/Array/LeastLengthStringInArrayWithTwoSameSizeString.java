package Array;

public class LeastLengthStringInArrayWithTwoSameSizeString {
	
	
	public static void main(String[] args) {
		
		
	String str[] = {"hello","hi","abc","abcd","abcde","am"};
		
		String min = str[0];
		for(int i=0;i<str.length;i++) {
		
		if(min.length()>str[i].length()) {
			
			min=str[i];                 // if we use only one loop and same length string is 
		}}                   // present, it won't get printed to print that also we need to run
		                  // another loop comparing the min length with all the String length and 
		for(int i=0; i<str.length;i++) { //print   those having same min string length.
			
			if(min.length()==str[i].length()) {
				
				System.out.println(str[i]);
				
			}
			
			
		}
		
	}
	

}
