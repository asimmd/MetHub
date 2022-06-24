package Array;

public class MinimumNumberInArrayWithoutUsingBubbleSort {
	
	public static void main(String[] args) {
		
int[] a= {20,30,50,40,10};
		
		int min =a[0];
		
		for(int i=1; i<a.length; i++) {
			
			if(min>a[i]) {
				
				min=a[i];
			}}
		
	System.out.println(min +" is the minimum number in array");
		
		
	}

}
