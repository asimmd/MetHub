package String;

import java.util.LinkedHashSet;

public class PrintOnlyUniqueCharacter {
	
	public static void main(String[] args) {
		
	
	String s="india";
	
	LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	// it stores only unique element and order of insertion is preserved.
	for(int i=0; i<s.length();i++) {
		
		set.add(s.charAt(i));  // add String elements in set collection		
	}
	
	for(Character ch: set) { // As it is set we use foreach loop for iteration 
	 int count=0;	
		for(int i=0;i<s.length();i++) {// Comparing Set element with String elment
			
			if(ch==s.charAt(i)) {
				
				count++;
				
			}}
		
		if(count == 1) {
			System.out.println(ch+ " is unique Character");
			
		}}
	
}}


