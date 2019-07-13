import java.util.Scanner;

public class Array {
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
	//	int[]input and int input[] mean the same thing

	public static void print(int[]input){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+" ");
		}

	}

	public static void sum(int[]input)
	{
		int sum=0;
		for(int i=0;i<input.length;i++){

			sum=sum+input[i];
		}
		System.out.println("Sum is: "+sum);
	}

	public static void max(int[]input)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<input.length;i++){
			if(input[i]>max){
				max=input[i];
			}


		}
		System.out.println("Maximum value is: "+max);

	}
	
	public static void uniqueElement(int arr[]){
		
	for(int i=0;i<arr.length;i++){
		
		int ans=0;
		
		int j=0;
		while(j<arr.length){
			
		if(j!=i){
			
			if(arr[i]!=arr[j])
				j++;
			else
				{ans++;
			    break;}
		}
		else
			j++;
		}
		if(ans==0){
			System.out.println(arr[i]);
			break;
		}
		
	}
	}
	public static void linearSearch(int[]input){
		
		Scanner t=new Scanner(System.in);
		System.out.println("Enter value that needs to be searched for in the array");
		int n=t.nextInt();
		int search=0;
		
		for(int i=0;i<n;i++){
			if(input[i]==n)
			{
				search++;
			}
			
		}
		if(search==0){
			System.out.println("Element is not present in array");
		}
		else
			System.out.println("Element is present in array");
		
			
		
	}
	public static void main(String[] args) {
		int array[]=takeInput();
		print(array);
		sum(array);
		max(array);
		linearSearch(array);
		uniqueElement(array);
		
		
		











	}

}
