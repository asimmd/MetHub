package String;

import java.util.LinkedHashSet;

public class CountTheNumberOfOccurenceWhenBothCaseWords {
	
	public static void main(String[] args) {
		
		
		String s="Hello Ta ta Bye bye";
		String[] str = s.split(" ");
			
			LinkedHashSet<String> set = new LinkedHashSet<String>();
			// it stores only unique element and order of insertion is preserved.
			for(int i=0; i<str.length;i++) {
				
				  set.add(str[i]);
			}
			
			for(String word: set) {  
			 int count=0;	
				for(int i=0;i<str.length;i++) {
					
					if(word.equalsIgnoreCase(str[i])) {
						
						count++;
						
					}
				}
		
				System.out.println(word+" = "+ count); // After comepleting one iteration of outer loop
			}   // print the word with count before 2nd iteration begins
			
	}

}
