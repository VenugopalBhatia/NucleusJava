import java.util.Scanner;

public class ConsecutiveDuplicates {
	public static String consecutiveDuplicates(String str,int i){


		if(i<0)
		{   
			String s="";
			return s;
		}


		String s=consecutiveDuplicates(str,i-1);

		if(i>=1&&str.charAt(i)==str.charAt(i-1)){

			return s;
		}
		else{
			s=s+str.charAt(i);
			return s;
		}



	}

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);

		String s=t.nextLine();
		System.out.println(consecutiveDuplicates(s,s.length()-1));
	}


}
