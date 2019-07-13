import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of nos.");
		int n = s.nextInt();
		int i = 1;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		while (i <= n) {
			
			System.out.println("Enter Value:");
			int j = s.nextInt();

			if (j >= max) {
				max = j;

			} 
			if(j <= min) {
				min = j;

			}
			i = i + 1;
		}
		System.out.println(max + " " + min);

	}
}
