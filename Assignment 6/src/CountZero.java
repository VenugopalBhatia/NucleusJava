import java.util.Scanner;

public class CountZero {
	public static int countZero(int[] arr,int count,int beginIndex){
		if(arr.length==0){
			return -1;
		}
		if(beginIndex==arr.length){
			return count;
		}
		if(arr[beginIndex]==0){
			count++;
		}
		int ans=countZero(arr,count,beginIndex+1);
		return ans;
		
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arrayLength=s.nextInt();
		int arr[]=new int[arrayLength];
		for(int i=0;i<arrayLength;i++){
			arr[i]=s.nextInt();
		}
		System.out.println(countZero(arr,0,0));
	}

}
