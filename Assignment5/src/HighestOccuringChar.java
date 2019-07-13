import java.util.Scanner;

public class HighestOccuringChar {
	public static void HIC(String str){
		int[] arr=new int[str.length()];
		int i=0;
		char[] a=new char[str.length()];
		while(i<str.length()){
			int count=1;
			
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					count++;
					
					
					
				}
				
				
				
				
				
			}
			arr[i]=count;
			a[i]=str.charAt(i);
			i++;
		}
		int max=Integer.MIN_VALUE;
		int track=0;
		for(int k=0;k<arr.length;k++){
			if(max<=arr[k]){
				max=arr[k];
				track=k;
			}
		}
			System.out.println(max+" "+a[track]);
		
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String l=s.next();
		HIC(l);
	}

}
