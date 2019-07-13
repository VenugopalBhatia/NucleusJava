package assignment2a;

import java.util.Scanner;

public class ReverseNumber {
	public static int NumLength(int n){
		int l=0;
		while(n>0){
			n=n/10;
			l++;
		}
		return l;
	}
	public static double revnum(int n){
		if(n==0){
			return 0;
		}
		int rem=n%10;
		
		
		return rem*Math.pow(10,NumLength(n)-1)+revnum(n/10);
	}
	
	
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=s.nextInt();
	System.out.println(NumLength(n));
	System.out.println(revnum(n));
	int rem;
	while(n>0)
	{
		rem=n%10;
		n=n/10;
		System.out.print(rem);
		
		
	}
	

	
	
}
}
