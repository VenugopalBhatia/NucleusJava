import java.util.Scanner;

public class EquilibriumIndex {
	public static void equilibriumIndex(int[] arr){
		for (int i=0;i<arr.length;i++){
			int sum1=0;
			int sum2=0;
			for(int j=0;j<i;j++){
				sum1=sum1+arr[j];
		}
			for(int k=i+1;k<arr.length;k++){
				sum2=sum2+arr[k];
			}
			if(sum1==sum2){
				System.out.println(arr[i]);
				
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
		int[] arr=takeInput();
		equilibriumIndex(arr);
	}
	
	
}


