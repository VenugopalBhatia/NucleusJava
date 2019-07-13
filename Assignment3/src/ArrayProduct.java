import java.util.Scanner;

public class ArrayProduct {
	public static void takeInput(int size,int Arr[],Scanner t){
		
		for(int i=0;i<size;i++){
			
			System.out.println("Enter "+i+" element");
			Arr[i]=t.nextInt();
			
			
		}
	}
	public static int Product(int size,int Arr[]){
		
		int prod=1;
		for(int i=0;i<size;i++){
			prod=prod*Arr[i];
		}
		return prod;
	}

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size=s.nextInt();
		int[] Arr=new int[size];
		takeInput(size,Arr,s);
		int Product=Product(size,Arr);
		System.out.println("Product of the values stored in array is:"+Product);
		
			
			
		
		
	}
}
