import java.util.Scanner;

public class Multiplication {
	public static int multiplication(int m,int n){
		if(n==0){
			return 0;

		}
		if(n==1)
		{
			return m;
		}

		int ans=multiplication(m,n-1);
		return ans + m;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
	System.out.println(multiplication(m,n));
	}
}
