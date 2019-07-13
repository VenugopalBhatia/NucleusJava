import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Value");
		n=s.nextInt();
		int a=0;
		int b=1;

		while(a<n){
			System.out.print(a+" ");
			int temp=a+b;
			a=b;
			b=temp;
		}


	}

}


