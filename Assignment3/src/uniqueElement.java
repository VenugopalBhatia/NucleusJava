import java.util.Scanner;

public class uniqueElement {
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
		int array[]=takeInput();
		uniqueElement(array);
	}
}
