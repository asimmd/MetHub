package Array;

public class SumofFirstThreeMaxNumber {
	
	public static void main(String[] args) {
		
		
		int a[] = {30,10,50,40,20};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]>a[j]) {
					
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			
		}
		
		int sum =0;
		for(int i=a.length-1; i>a.length-4;i--) {
			
			
			int num = a[i];
		    sum = sum + a[i];
			
		}
		
		System.out.println(sum +"  is the sum of first 3 maximum numbers in Array");
		
		
	}
	
	

}
