import java.util.Scanner;

public class LastIndex {
	public static int lastIndex(int[] arr,int i,int t){
        if(arr.length==0){
        	return-1;
        }
		if(i<arr.length-1&&lastIndex(arr,i+1,t)!=-1){
			return lastIndex(arr,i+1,t);
		}
		else
			if(arr[i]==t){
				return i;
			}

			else
			{
				return -1;
			}

	}
	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<5;i++){
			arr[i]=s.nextInt();
		}
		System.out.println(lastIndex(arr,0,7));
	}

}
