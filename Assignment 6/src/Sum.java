import java.util.Scanner;

public class Sum {
 public static int sum(int[] arr,int beginIndex){
	 if(arr.length==0||beginIndex>=arr.length){
		 return 0;
	 }
	 int ans=sum(arr,beginIndex+1);
	 return ans+arr[beginIndex];
	 
	 
 }
 
 public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int size=s.nextInt();
	int[] arr=new int[size];
	for(int i=0;i<size;i++){
		arr[i]=s.nextInt();
	}
	System.out.println(sum(arr,0));
}
}
