import java.util.Scanner;

public class CountParenthesis {
	public static boolean countParenthesis(String str,int index,int count){
		if(index>=str.length()&&count==0){
			return true;
		}
		else
			if(index>=str.length()&&count!=0){
				return false;
			}

		if(str.charAt(index)=='('){
			count++;
		}
		else
		{
			if(str.charAt(index)==')')
			{
				count--;
			}

		}


		boolean c=countParenthesis(str,index+1,count);
		return c;

	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(countParenthesis(str,0,0));
	}
}

