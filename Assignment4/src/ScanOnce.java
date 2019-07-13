import java.util.Scanner;

public class ScanOnce {
	public static void scanOnce(int[] arr){
		int countOne=0;
		int countTwo=0;
		int countZero=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==1){
				countOne++;
			}

			if(arr[i]==2){
				countTwo++;

			}
			if(arr[i]==0){
				countZero++;
			}


		}
		for(int i=0;i<countZero;i++){
			arr[i]=0;
		}
		for(int i=countZero;i<countZero+countOne;i++){
			arr[i]=1;
		}
		for(int i=countZero+countOne;i<countZero+countOne+countTwo;i++){
			arr[i]=2;
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
		int Array[]=takeInput();
		scanOnce(Array);
		print(Array);
		
	}
}
