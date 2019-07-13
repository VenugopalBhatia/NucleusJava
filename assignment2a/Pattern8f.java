package assignment2a;

import java.util.Scanner;

public class Pattern8f {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Value:");
		int n=s.nextInt();
		int i=1;
		while(i<=n){
			int j=1;
			while(j<=i){
				System.out.print(" ");
				j=j+1;
			}
			int k=1;
			while(k<=(n-i+1))
			{
				if(i%2==0)
				{System.out.print("0 ");
				}
				else{
					System.out.print("1 ");
				}
				k=k+1;
				
			}
			i=i+1;
			System.out.print("\n");
		}
		
	}

}
