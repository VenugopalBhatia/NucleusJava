import java.util.Scanner;

public class primeN {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value");
		n = s.nextInt();

		int i = 2;
		while (i <= n) {
			int divisor = 2;
			boolean prime = true;
			while (divisor < i) {
				if (i % divisor == 0) {
					prime = false;
					break;
				} else {
					divisor = divisor + 1;
				}
			}
			if (prime) {
				System.out.println(i + " ");
			}
			i = i + 1;
		}

	}

}
