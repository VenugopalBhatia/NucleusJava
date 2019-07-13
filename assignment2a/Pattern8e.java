package assignment2a;

import java.util.Scanner;

public class Pattern8e {public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter value:");
	int n=s.nextInt();
	int i=1;
	while(i<=n)
	{ 
		int j=1;
		while(j<(n-i+1))
		{System.out.print(n-j+1);
		j=j+1;
		}
		System.out.print("*");
		int k=2;
		int l=i;
		while(k<=i){
			
			System.out.print(l-1);
			k=k+1;
			l=l-1;
			
		}
		i=i+1;
		System.out.print("\n");
	}
}

}
