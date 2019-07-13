import java.util.Scanner;

public class EquilibriumIndex2 {
	public static void equilibriumIndex2(int arr[]){
		
		int i=1;
		int sum1=arr[0];
		int sum2=0;
		for(int j=2;j<arr.length;j++){
			sum2=sum2+arr[j];
			
		}
		while(i<arr.length){
			if(sum1==sum2)
				{System.out.println(i);
				 break;
				}
		
			else{
				sum1=sum1+arr[i];
			    sum2=sum2-arr[i+1];
			    i++;
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



	}public static void main(String[] args) {
		int[] arr=takeInput();
		equilibriumIndex2(arr);
	}

}
