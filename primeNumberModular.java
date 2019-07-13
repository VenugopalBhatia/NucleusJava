import java.util.Scanner;

public class primeNumberModular {
	public static boolean isPrime(int n){

		int divisor=2;


		while(divisor<n){

			if(n%divisor==0){

				return false;

			}
			divisor=divisor+1;



		}
		return true;


	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int number=s.nextInt();
		boolean prime=isPrime(number);

		if(prime==true){

			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}


	}

}
