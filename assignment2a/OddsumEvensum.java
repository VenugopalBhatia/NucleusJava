package assignment2a;

import java.util.Scanner;

public class OddsumEvensum {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter no.");
		int n=s.nextInt();
		int sume=0;
		int sumo=0;
		int rem;
		while(n>0)
		{
		rem=n%10;
		n=(n/10);
		
		if(rem%2==0)
			sume=sume+rem;
		else
			sumo=sumo+rem;
		
		
	}
		System.out.println("Sum of even nos. is "+sume+" and sum of odd nos. is "+sumo);

}
}
