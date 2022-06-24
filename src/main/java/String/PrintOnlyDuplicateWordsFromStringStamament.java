package String;

import java.util.LinkedHashSet;

public class PrintOnlyDuplicateWordsFromStringStamament {
	

	public static void main(String[] args) {
		
	String s="Welcome to India India";
	String[] str = s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		// it stores only unique element and order of insertion is preserved.
		for(int i=0; i<str.length;i++) {
			
			  set.add(str[i]);
		}
		
		for(String word: set) {  
		 int count=0;	
			for(int i=0;i<str.length;i++) {
				
				if(word.equals(str[i])) {
					
					count++;
					
				}
			}
	
			if(count>1) {
				
				System.out.println(word+"  is Duplicate word present in the statement");
			}
		}}

}
