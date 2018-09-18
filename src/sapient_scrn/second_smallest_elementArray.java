package sapient_scrn;

public class second_smallest_elementArray {

	public static void main(String[] args) {


		
		int []arr  = {12, 23,12,32,43,1,2,2,10};
		
		int len = arr.length;
		int temp;
		for(int i =0 ; i<len;i++) {
			for(int j=i; j<len;j++) {
				
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
			
		}
		for(int c: arr) {
			System.out.println(c);
		}
		
		System.out.println("second smallest element in an array is "+ arr[1]);
		

	}

}
