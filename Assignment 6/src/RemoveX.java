import java.util.Scanner;

public class RemoveX {
public static String removeX(String s,String s2,int i){
	if(i==s.length()){
		return s2;
	}
	if(i<s.length()&&s.charAt(i)!='x'){
		s2=s2+s.charAt(i);
				
	}
	return removeX(s,s2,i+1);
	
}

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String t=s.next();
	String s2="";
	System.out.println(removeX(t,s2,0));
}
}
