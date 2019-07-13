import java.util.Scanner;

public class InsertStar {
public static String insertStar(String s1,String s2,int i){
	if(i==s1.length()){
		return s2;
	}
	if(i<s1.length()-1&&s1.charAt(i)==s1.charAt(i+1)){
		 s2=s2+s1.charAt(i)+"*";
	}
	else{
	s2=s2+s1.charAt(i);
	}
	return insertStar(s1,s2,i+1);
	
}

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	String s2="";
	System.out.println(insertStar(s1,s2,0));
}
}
