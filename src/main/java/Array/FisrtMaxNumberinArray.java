package Array;

public class FisrtMaxNumberinArray {
	
	
	public static void main(String[] args) {
		
	
	int a[]= {30,10,50,40,20};
	
	for(int i=0; i<a.length; i++) {
		
		for(int j=i+1; j<a.length; j++) {     // you can also arrange the array in descending
		                                     // order and sop a[0];
			if(a[i]>a[j]) {
				
				int temp =a[i];
				a[i]=a[j];
				a[j]=temp;
			               }
			
	                                      }
		
	                               }
	
	System.out.println("First largest number in Array is  "+a[a.length-1]);
	
	}
}
