import java.util.Scanner;

public class PairSum {
	public static void sumPair(int[] arr,int x){
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(j!=i){
					
					if(arr[i]+arr[j]==x){
						System.out.println(arr[i]+" "+arr[j]);
					}
				}
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
				int[] arr=takeInput();
				Scanner s=new Scanner(System.in);
				System.out.println("Enter the number:");
				int x=s.nextInt();
				sumPair(arr,x);
			}
	}


