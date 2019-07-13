package assignment2a;

import java.util.Scanner;

public class Exponent {public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter value x:");
	int x= s.nextInt();
	Scanner t = new Scanner(System.in);
	System.out.println("Enter power n:");
	int n = t.nextInt();
	int i=1;
	int prod=1;
	
	while(i<=n)
	{
		prod=(prod*x);
		i=i+1;
	}
	System.out.println("x^n:"+prod);
}

}
