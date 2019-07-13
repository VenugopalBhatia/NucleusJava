package assignment2a;

import java.util.Scanner;

public class Pattern8c {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value");
		int n=s.nextInt();
		int i=1;
		while(i<=n){
			System.out.print("1");
			int j=2;
			while(j<i){
				System.out.print("2");
				j=j+1;
			}
			if(i<n)
			{System.out.print("1");
			
			}
			i=i+1;
			System.out.print("\n");
		}
	}

}
