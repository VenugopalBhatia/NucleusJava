import java.util.Scanner;

public class SumInteger {
public static int sumInteger(int m){
	if(m>=0&&m<=9){
		return m;
	}
	
	
	int rem=m%10;
	int ans=sumInteger(m/10);
	return ans+rem;
}

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int m=s.nextInt();
	System.out.println(sumInteger(m));
}
}
