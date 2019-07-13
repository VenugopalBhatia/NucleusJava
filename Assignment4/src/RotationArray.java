import java.util.Scanner;

public class RotationArray {
public static void rotationArray(int[] arr){
	int min= Integer.MAX_VALUE;
	int temp=0;
	for(int i=0;i<arr.length;i++){
		if(arr[i]<min){
			min=arr[i];
			temp=i;
			
		}
		
	}
	System.out.println(temp);
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
	rotationArray(arr);
	
}
}
