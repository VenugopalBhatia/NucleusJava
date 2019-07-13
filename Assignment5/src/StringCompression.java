import java.util.Scanner;

public class StringCompression {
	public static void stringCompression(String str){
		String s="";
		for(int i=0;i<str.length();i++){
			int count=1;
			for(int j=0;j<str.length();j++)
			{if(str.charAt(i)==str.charAt(j)&&i!=j){

				int check=0;
				int k=0;
				while(k<s.length())
				{
					if(s.charAt(k)!=str.charAt(i))
					{

						k++;
					}
					else
					{
						check++;
	 					count--;
						break;
					}


				}
				if(check==0){
					count++;
				}
			}
			}
			if(count>=1)
			{
				System.out.print(str.charAt(i));
				if(count>1){
					System.out.print(count);
				}
				int check2=0;
				int m=0;
				while(m<s.length()){
					if(s.charAt(m)!=str.charAt(i))
					{m++;
					}
					else 
					{check2++;
					break;
					}
				}
				if(check2==0)	
				{s=s+str.charAt(i);
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		stringCompression(str);
	}
}
