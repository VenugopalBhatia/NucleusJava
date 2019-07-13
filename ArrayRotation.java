
public class ArrayRotation {
	public static void arrayRotation(int [] arr){
		
		int i=0;
		int j=arr.length-1;
		int mid=(i+j)/2;
		while(arr[mid]<arr[mid+1]&&arr[mid]>arr[mid-1]){
		if(arr[mid]<arr[i]){
			j=mid;
			mid=(i+j)/2;
		}
		else{
		if(arr[mid]>arr[j]){
			i=mid;
			mid=(i+j)/2;
		}
		}
		}
		
		System.out.println(mid);
		
		
		

	}

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7};

		arrayRotation(arr);
	}
}
