package assignment2a;

import java.util.Scanner;

public class Pattern8b {public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Value:");
	int n=s.nextInt();
	int i=1;
	System.out.println(i);
	i=i+1;
	while(i<=n){
		System.out.print(i-1);
		int j=2;
		while(j<i){
			System.out.print("0");
			j=j+1;
		}
		System.out.println(i-1);
		i=i+1;
	}
	
	
	
	
}

}
