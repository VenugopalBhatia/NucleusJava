import java.util.Scanner;

public class sumTriplet {
	public static void tripletSum(int arr1[],int arr2[],int arr3[],int x){
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				for(int k=0;k<arr3.length;k++){
					if(arr1[i]+arr2[j]+arr3[k]==x){
						System.out.println("Array 1:"+arr1[i]+"Array 2:"+arr2[j]+"Array 3:"+arr3[k]);
					}
				}
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
	
}


}
