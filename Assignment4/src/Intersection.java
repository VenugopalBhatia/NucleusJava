import java.util.Scanner;

public class Intersection {
	public static int[] intersection(int[]arr1,int[]arr2){
		int l;
		int k=0;
		if(arr1.length>arr2.length){
			l=arr2.length;
		}
		else
			l=arr1.length;
		int[] intersection=new int[l];
		int m=0;
		while(m<l){
			
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					intersection[m]=arr1[i];
					m++;
					
					
				}
				
				
			}
		}
		if(m<l)
		{intersection[m]=-1;
		m++;}
		
		}
		return intersection;
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
	int array1[]=takeInput();
	int array2[]=takeInput();
	int array3[]=intersection(array1,array2);
	print(array3);
	
}
	

}
