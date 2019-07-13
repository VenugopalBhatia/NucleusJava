import java.util.Scanner;


public class CheckPrime {

	public static boolean  isPrime(int num){
		int divisor = 2;

		while(divisor < num){
			if(num % divisor == 0){
				return false;
			}
				divisor++;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int number = s.nextInt();
		boolean ans = isPrime(number);
		
		
	//	System.out.println(divisor);
		if(ans){
			System.out.println(number + " is Prime ");
		}
		else{
			System.out.println(number+" is not prime");
		}
		

	}

}
