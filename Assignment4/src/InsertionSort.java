import java.util.Scanner;

public class InsertionSort {
	public static void insertionSort(int arr[]){
		for(int i=1;i<arr.length;i++){
			int j=i-1;
			if(arr[i]>arr[j]){
				System.out.print("");
				
				
			}
			else
				{
				while(j>-1&&arr[i]<=arr[j]){
					j--;
					
				}
				int temp=arr[i];
				for(int k=i;k>=j+2;k--){
					arr[k]=arr[k-1];
				}
				arr[j+1]=temp;
				}
			
			
			
			
		}
	}
	public static void print(int[]input){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+" ");
		}

	}
	public static int[] takeInput(){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=s.nextInt();
		int inputArray[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.println("Enter "+i+" Element");
			inputArray[i]=s.nextInt();

		}
		return inputArray;



	}
	public static void main(String[] args) {
		int arr[]=takeInput();
		insertionSort(arr);
		print(arr);
		
	}

}
