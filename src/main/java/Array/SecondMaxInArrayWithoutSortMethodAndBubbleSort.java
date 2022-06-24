package Array;

public class SecondMaxInArrayWithoutSortMethodAndBubbleSort {

	public static void main(String[] args) {
		
		
		int[] a= {20,30,50,40,10};
		
		int Fmax = a[0];
		int Smax = a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(Fmax<a[i]) {
				
				Smax=Fmax;
				Fmax=a[i];
				
			}
			
			else if(Smax<a[i]){
				
				Smax=a[i];
			}
			
		}
		
		
		System.out.println(Fmax + "  is the maximum number in array"+"\n"+Smax+"  is the Second max number in Array");
		
	}
	
}
