package Array;

public class FirstMaximumWithoutUsingBubbleSort {

	public static void main(String[] args) {
		
		int[] a= {20,30,50,40,10};
		
		int max =a[0];
		
		for(int i=1; i<a.length; i++) {
			
			if(max<a[i]) {
				
				max=a[i];
			}}
		
	System.out.println(max +" is the maximum number in array");
}
}