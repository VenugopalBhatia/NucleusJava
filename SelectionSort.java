import java.util.Scanner;

public class SelectionSort {
	public static void selectionSort(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			int min=i;
			
			for(int j=i+1;j<arr.length;j++){
				
				if (arr[j]<arr[min]){
					
					min=j;
				}

			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
			
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
	public static void print(int[]input){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+" ");
		}

	}
	public static void main(String[] args) {
		int arr[]=takeInput();
		selectionSort(arr);
		print(arr);
	}
	

}
