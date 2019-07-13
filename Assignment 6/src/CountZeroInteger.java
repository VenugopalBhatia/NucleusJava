import java.util.Scanner;

public class CountZeroInteger {
	public static int countZeroInteger(int m,int count){
		
		if(m>=0&&m<=9){
			if(m==0){
				count++;
			}
			return count;
		}
		int rem=m%10;
		if(rem==0){
			count++;
		}
		int ans=countZeroInteger(m/10,count);
		return ans;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(countZeroInteger(n,0));
	}

}
