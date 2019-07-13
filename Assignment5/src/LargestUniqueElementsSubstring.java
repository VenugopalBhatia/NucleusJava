import java.util.Scanner;

public class LargestUniqueElementsSubstring {
	public static void lues(String str){
		String arr[]=new String[100];
		int m=0;
		for(int i=0;i<str.length();i++){
			String s="";
			s=s+str.charAt(i);
			int count=0;

			for(int j=i+1;j<str.length();j++){
				int k=0;

				while(k<s.length()){
					if(s.charAt(k)!=str.charAt(j)){
						k++;
					}
					else{
						count++;
						break;
					}

				}
				if(count==0){
					s=s+str.charAt(j);
				}
			}

			arr[m]=s;


			m++;



		}
		int max=Integer.MIN_VALUE;
		int ind=0;
		for(int t=0;t<100;t++){
			String z="";
			if(arr[t]!=null){
			z=z+arr[t];
			}


			if(arr[t]!=null&&z.length()>max){
				max=z.length();

				ind=t;
			}
		}
		System.out.println(arr[ind]);
	}





	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		lues(str);

	}

}
