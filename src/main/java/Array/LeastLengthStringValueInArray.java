package Array;

public class LeastLengthStringValueInArray {
	
	public static void main(String[] args) {
		
		String str[] = {"hello","hi","abc","abcd","abcde","abc"};
		
		String min = str[0];
		for(int i=0;i<str.length;i++) {
		
		if(min.length()>str[i].length()) {
			
			min=str[i];
		}}
		
		System.out.println(min);
	}

}
