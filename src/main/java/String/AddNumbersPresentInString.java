package String;

public class AddNumbersPresentInString {
	
	public static void main(String[] args) {
		
		String s="al4#p6h%8&a";
		
		int sum = 0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				
				int n = s.charAt(i)-48;	
				System.out.println(n);
				sum=sum+n;
				
			}
			
			
		}
		
		System.out.println(sum);
	}

}
