package String;

public class ReverseStringUsingThirdVariable {

	public static void main(String[] args) {
		
		String s= "India";
		String rev ="";
		for(int i=s.length()-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
			
		}
		
		System.out.println(rev);
		
		
		// we can run loop for i=0;i<s.length() also just need to change rev=ChartAt(i)+rev to reverse		
		
	}
	
	
	
}
