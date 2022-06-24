package Array;

import java.util.Arrays;

public class SecondMaximumWithoutUsingBubbleSortinArray {
	
	
	public static void main(String[] args) {
		
		int a[] = {30,10,50,40,20};
		
		Arrays.sort(a);
		
		
		System.out.println("Second maximum number is "+ a[a.length-2] );
		
		
	}

}
