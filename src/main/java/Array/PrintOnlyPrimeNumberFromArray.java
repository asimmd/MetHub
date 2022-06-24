package Array;

public class PrintOnlyPrimeNumberFromArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<arr.length;i++) {
			
			int num = arr[i];
			
			int j=2;
			
			while(num>=j) {
				
				if(num%j==0) {
					
				// when we have only one number we can give sop statement here as not a prime no
					break;
				}
				
				else {
					
					j++;
				}
				
			}
			
			if(num==j) {
				
				System.out.println(arr[i]+" is a prime number");
				
			}
		}
		
	}

}
