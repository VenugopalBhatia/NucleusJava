import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class pattern {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value");
		n = s.nextInt();
		int i = 1;
		int col = 1;
		while (col <= n) {			
			int j = 1;

			while (j <= i) {
				System.out.print(col);
				col = col + 1;
				j = j + 1;
			}
			i = i + 1;
			System.out.print("\n");
		}

	}

}
