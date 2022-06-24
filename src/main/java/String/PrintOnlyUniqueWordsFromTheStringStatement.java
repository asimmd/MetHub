package String;

import java.util.LinkedHashSet;

public class PrintOnlyUniqueWordsFromTheStringStatement {
	
	public static void main(String[] args) {
		
		String s="Welcome to India India";
		String[] str = s.split(" ");
			
			LinkedHashSet<String> set = new LinkedHashSet<String>();
			// it stores only unique element and order of insertion is preserved.
			for(int i=0; i<str.length;i++) {
				
				  set.add(str[i]);
			}
		
			for(String word:set) {
				
				System.out.print(word+" ");
			}
	}

}
