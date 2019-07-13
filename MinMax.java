import java.util.Scanner;


public class MinMax {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of numbers ");
		int n = s.nextInt();
		int i = 1; // next number to be taken
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
	
		while( i <= n){
			System.out.println("Enter " + i +" number :");
			int currentNum = s.nextInt();
			if(currentNum < min){
				min = currentNum;
			}
			if(currentNum > max){
				max = currentNum;
			}
			//i = i + 1;
			++i;
		}
		System.out.println("Min is :"+ min);
		System.out.println("Max is :"+max);
		
		
//		int a = 10, b = 11;
//	
//		if( a++ <  10   ||  b++ > 10){
//			System.out.println("Inside if");
//		}
//		System.out.println("a : "+ a+" b : "+ b);
		
		
		

	}

}
