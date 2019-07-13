package Assignment2b;

import java.util.Scanner;

public class Q1 {public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter Value:");
	int n=s.nextInt();
	Scanner t =new Scanner(System.in);
	System.out.println("Enter 0 for sum and 1 for product:");
	int i=t.nextInt();
	int sum=0;
	int prod=1;
			
	if(i==0){
		int j=1;
		while(j<=n)
		{sum=sum+j;
		j=j+1;
		}
		System.out.println(sum);
	}
	else
		if(i==1)
		{
			int k=1;
			while(k<=n)
			{ prod=prod*k;
			  k=k+1;
			}
			System.out.println(prod);
		}
	
}

}
