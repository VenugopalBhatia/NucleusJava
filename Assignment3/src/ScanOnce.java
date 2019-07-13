import java.util.Scanner;

public class ScanOnce {
	public static void scanOnce(int[] arr){
		int nz=0;
	
	for(int i=0;i<arr.length;i++){
		while(nz<arr.length&&arr[nz]==0){
			nz++;
		}
		if(arr[i]==0&&nz<arr.length&&arr[nz]==1){
			if(nz!=i){
				int temp=arr[i];
				arr[i]=arr[nz];
				arr[nz]=temp;
				nz++;
				
			}
			else
				System.out.print("");
		}
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
		scanOnce(arr);
		print(arr);
	}
	
}
