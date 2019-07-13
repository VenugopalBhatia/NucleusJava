import java.util.Scanner;

public class FirstIndexRecursion {
	public static int firstIndexRecursion(int[] a,int s,int startIndex){
		if(a.length==0||startIndex>=a.length){
			return-1;
		}
		if(a[startIndex]==s){
			return startIndex;
		}
		
		int smallAns=firstIndexRecursion(a,s,startIndex+1);
		return smallAns;
		
	}
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int length=s.nextInt();
		int[] arr=new int[length];
		for(int i=0;i<length;i++){
			arr[i]=s.nextInt();
		}
		System.out.println(firstIndexRecursion(arr,a,0));
		
		
	}

}
