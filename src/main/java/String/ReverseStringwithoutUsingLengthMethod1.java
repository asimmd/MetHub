package String;

public class ReverseStringwithoutUsingLengthMethod1 {
	
	public static void main(String[] args) {
		
		
		String s="India";
		char[] ch = s.toCharArray();
		String rev="";
		for(char c:ch) {
			
			rev=c+rev;			
		}
		
		System.out.println(rev);
		
	}

}
