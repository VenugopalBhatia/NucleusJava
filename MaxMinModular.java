
import java.util.Scanner;

public class MaxMinModular {
	public static void MaxMin(int n, Scanner s)
	{   int i=1;
	
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		while(i<=n){
			System.out.println("Enter value:");
			int j=s.nextInt();
			if(j<=min){
				min=j;
			}
			if(j>=max){
				max=j;
			}
			i=i+1;
		}
		System.out.println("Maximum value: "+max+" Minimum Value: "+min);
		
		
		
		
	}public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		System.out.println("Enter the number of nos.");
		int number=t.nextInt();
		MaxMin(number,t);
		
		
	}

}
