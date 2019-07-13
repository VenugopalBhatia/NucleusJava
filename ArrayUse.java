import java.util.Scanner;


public class ArrayUse {

	public static  int[]  takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size = s.nextInt();
		int inputArray[] = new int[size];
		for(int i = 0; i < size; i++){
			System.out.println("Enter "+i+" element");
			inputArray[i] = s.nextInt();
		}
		return inputArray;
	}
	
	public static void  print(int[] input){
		for(int i = 0; i < input.length ; i++){
			System.out.print(input[i]+" ");
		}
	}
	
	
	public static int largest(int[] input){
		int max = Integer.MIN_VALUE;
	//	int max = input[0];
		for(int i = 0; i < input.length; i++){
			if(max < input[i]){
				max = input[i];
			}
		}
		return max;
	}
	
	public static void incrementArray(int[] input){
		for(int i = 0; i < input.length; i++){
			input[i]++;
		}
	}

	public static void main(String[] args) {
	
//		int input1[] = new int[4];
//		System.out.println(input1);
//		print(input1);
	
//		int[] input = new int[4];
//		input[0] = 1;
//		input[1] = 2;
		int[] input = {1,2,3,4};
		int[] input2 = {10,20,30,40};
		print(input);
		input = input2;
		System.out.println();
		print(input);
		input2[3] = 100;
		print(input);
		
//		String name = s.nextLine();
		
//		int[] input = takeInput();
//		print(input);
////		System.out.println("Max :"+ largest(input));
//		System.out.println();
//		incrementArray(input);
//		print(input);
	}

}
