package String;

import java.util.LinkedHashSet;

public class PrintThePositionOfWordsInStatement {
	
	public static void main(String[] args) {
		
		String s= "Welcome To India";
		
		String[] str = s.split(" ");
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		for(int i=0;i<str.length;i++) {
			
			lhs.add(str[i]);
			
		}
		
		for(String word: lhs) {
			
			
			for(int i=0;i<str.length;i++) {
				
				if(word.equals(str[i]))
				{
				System.out.println(word+" "+(i+1));
				
			}
				}
			
			
		}
		
		
	}

}
