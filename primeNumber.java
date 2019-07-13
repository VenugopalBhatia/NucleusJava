import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
		int n;
		Scanner s= new Scanner(System.in);
		n=s.nextInt();

		int divisor=2;

		while(divisor<n){
			if (n%divisor==0){
				System.out.println("No."+n+" is not prime");
				return;
			}
			else
				divisor=divisor+1;
		}
		System.out.println("No."+n+" is prime");



	}

}
