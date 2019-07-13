package assignment2a;

import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a");
		int a=s.nextInt();
		Scanner t = new Scanner(System.in);
		System.out.println("Enter b");
		int b=t.nextInt();
		Scanner e = new Scanner(System.in);
		System.out.println("Enter c");
		int c=e.nextInt();
		
		int m=((b*b)-4*a*c);
		
		float n=(float)(Math.sqrt(m));
		double x1=((-b)+n)/2*a;
		double x2=((-b)-n)/2*a;
		
		System.out.println("Roots are"+x1+","+x2);
		
		if(m>=0)
		{ System.out.println("Real roots");
		
		
		}
		else
			
			System.out.println("Complex Roots");
		
		
		
		
	}

}
