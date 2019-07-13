package assignment2a;

import java.util.Scanner;

public class Pattern8a {public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter Value");
	int n=s.nextInt();
	int i=1;
	while(i<=n){
		int j=1;
		while(j<=i){
			System.out.print("1");
			j=j+1;
		}
		i=i+1;
		System.out.print("\n");
	}
	
	
}

}
