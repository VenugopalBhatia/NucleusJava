import java.util.Scanner;

public class GCDRecursive {
	public static int gcdRecursive(int a1,int a2,int beginIndex,int a3){
		int t=0;
		if(a1>a2){
			t=a2;
		}
		else{
			t=a1;
		}
		if(beginIndex>t){
			return a3;
		}
		if(a1%beginIndex==0&&a2%beginIndex==0){
			a3=beginIndex;
		}
		return gcdRecursive(a1,a2,beginIndex+1,a3);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int m=s.nextInt();
		int a=gcdRecursive(t,m,1,1);
		System.out.println(a);
	}

}
