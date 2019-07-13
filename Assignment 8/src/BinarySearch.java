import java.util.Scanner;

public class BinarySearch {
	public static boolean binarySearch(int[] arr,int n){
		boolean check =false;
		if(arr.length==0){
			return check;
		}
		
		if((arr[arr.length-1]+arr[0])/2==n){
			check=true;
			return check;
		}
		int [] smallOutput=new int[arr.length-1];
		if((arr[arr.length-1]+arr[0])/2<n){
			
			for(int i=0;i<arr.length-1;i++){
				smallOutput[i]=arr[i+1];
			}
		}
		else{
			if((arr[arr.length-1]+arr[0])/2>n){
			
				for(int i=0;i<arr.length-1;i++){
					smallOutput[i]=arr[i];
				}
			}
		}
	    check=binarySearch(smallOutput,n);
		return check;
	}
	
	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 int searchFor=s.nextInt();
	 int arr[]=new int[n];
	 for(int i=0;i<n;i++){
		 arr[i]=s.nextInt();
	 }
	 
		System.out.println(binarySearch(arr,searchFor));
	}
	

}
