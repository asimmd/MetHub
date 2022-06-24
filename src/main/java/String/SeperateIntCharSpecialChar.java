package String;

public class SeperateIntCharSpecialChar {
	
	public static void main(String[] args) {
		
		String s="a1l&p*2h$3a";
		String alphabet="";
		String number ="";
		String special ="";
		
		for(int i=0; i<s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
				
				alphabet=alphabet+ch;
			
			}
			else if(ch>='0' && ch<='9') {
				
				number = number+ch;
				
			}
			
			else {
				
				special =special+ch;
			}
		}
		System.out.println(alphabet);
		System.out.println(number);
		System.out.println(special);
	}

}
