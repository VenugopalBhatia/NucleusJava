package assignment2a;

import java.util.Scanner;

public class Pattern8d {public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter value:");
	int n=s.nextInt();
	int i=1;
	while(i<=n)
	{
		int j=1;
		while(j<=(n-i+1))
		{
			System.out.print(j);
			j=j+1;
			
		}
		i=i+1;
		System.out.print("\n");
	}
	
}

}
