package sapient_scrn;

public class second_smallest_sortRotatedArray {

	public static void main(String[] args) {
	
		
		int [] arr = {3,4,5,6,1,2};
		int i=0, j=1;
		int len = arr.length;
	
		while (i<len&&j<len) {
			
			if(arr[i]<arr[j])
			j++;	
			else if(arr[i]>=arr[j]) {
				i=j;
				j++;
			}
				
		}
		System.out.println(arr[i+1]);
	}
}
