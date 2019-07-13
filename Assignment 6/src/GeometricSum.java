import java.util.Scanner;

public class GeometricSum {
	public static double geometricSum(int k){
		
		if(k==0){
			return 1;
		}
		
		
		float t=exponent(2,k);
		double ans=geometricSum(k-1);
		
		return (ans+(1.0/t));
	}
	public static int exponent(int m,int n){
		if(n==0){
			return 1;
		}
		
		return m*exponent(m,n-1);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		System.out.println(geometricSum(k));
		
	}

}
