import java.util.Scanner;

public class TwoArraySum {
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
	public static int[] arraySum(int[] arr1,int[] arr2){
		int l;
		if(arr1.length>arr2.length){
			l=arr1.length;
		}
		else
		{
			l=arr2.length;
		}
		
		int[] arr3=new int[l+1];
		int temp=0;
		for(int i=l;i>0;i--){
			if(arr3[i]+arr1[i-1]+arr2[i]<=9)
			{
				arr3[i]=arr3[i]+arr1[i-1]+arr2[i-1];
			}
			
			else
				{
				 temp=arr3[i];
				arr3[i]=((arr3[i]+arr1[i-1]+arr2[i-1])%10);
				arr3[i-1]=((temp+arr1[i-1]+arr2[i-1])/10);
				}
		}
			
			
		
		
		return arr3;

}
	public static void print(int[]input){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+" ");
		}

	}
	public static void main(String[] args) {
		int[] array1=takeInput();
		int[] array2=takeInput();
		int[] array3=arraySum(array1,array2);
		print(array3);
		
		
	}
}
