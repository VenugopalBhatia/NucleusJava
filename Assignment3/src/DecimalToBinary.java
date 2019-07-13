import java.util.Scanner;

public class DecimalToBinary {
	public static int[] convert(int n){
		
		int[] Array=new int[25];
		int rem;
		for(int i=0;i<25;i++){
			
			if(n>0)
				{rem=n%2;
				Array[25-i-1]=rem;
				n=n/2;}
			else{
				Array[25-i-1]=-1;
			}
			
				
				
			
		}
		return Array;
	}
	
	public static void print(int[]A){
		
	for(int i=0;i<A.length;i++){
		if(A[i]!=-1){
		System.out.print(A[i]+" ");
		}
		
	}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int[] Arr=convert(n);
		print(Arr);
		
			
			
		
		
	}

}


