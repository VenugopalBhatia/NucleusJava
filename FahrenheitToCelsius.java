import java.util.Scanner;


public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fahrenheitValue = 0;
		//		int minFahrenheitValue = 0;
		int maxFahrenheitValue = 300;

		while(  fahrenheitValue <= maxFahrenheitValue ){
			int celsiusValue  = (int)( (5.0/9)*(fahrenheitValue - 32));
			System.out.println(fahrenheitValue + "  "+celsiusValue);
//			System.out.print("    ");
//			System.out.println(celsiusValue);
			fahrenheitValue = fahrenheitValue + 20;
		}

		//		String str = "abc";
		//		System.out.println(str + 13);
		//		char ch1 = 'a';
		//		char ch2 = 'b';
		//	
		//		System.out.println((char)(ch1 + ch2));

		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number :");
		int first = s.nextInt();
		
		System.out.println("Enter second number :");
		int second = s.nextInt();
		
		System.out.println("Enter third number :");
		int third = s.nextInt();
		
		if(first >= second && first >= third){
			System.out.println(first+ " is greater");
		}
		else if(second >= first && second >= third){
			System.out.println(second + "is greater");
		}
		else{
			System.out.println(third + " is greater");
		}
		
		
		




	}

}
