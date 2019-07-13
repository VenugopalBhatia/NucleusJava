import java.util.Scanner;

public class PrintParenthesisContents {
public static String printparenthesisContents(String a,int i){
	
	if(i>=a.length()){
		String s="";
		return s;
	}
	String s1=printparenthesisContents(a,i+1);
	String s = "";
	if(a.charAt(i)=='('){
		int j=i;
		while(a.charAt(j)!=')')
		{
			s=s+a.charAt(j);
			j++;
		}
		s = s +')';
	}
		return s + s1;
	
}
public static void main(String[] args) {
	Scanner t=new Scanner(System.in);
	String s=t.nextLine();
	System.out.println(printparenthesisContents(s,0));
}
}
