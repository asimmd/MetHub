package Array;

public class PrintStringWithMaxLengthInArray {
	
	public static void main(String[] args) {
		
		String str[] = {"hello","hi","abc","abcd","abcde","abc"};
		
		String max = str[0];
		
		for(int i=1; i<str.length;i++) {
			
			if(max.length()<str[i].length()) {
				
				max = str[i];
				
			}

		}
		
		
		for(int i=0; i<str.length;i++) {
			
			if(max.length()==str[i].length()) {
				
				System.out.println(str[i]);
			}
			
		}
		
		
	}
	
	

}
