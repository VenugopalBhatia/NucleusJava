import java.util.Scanner;

public class StringComparison {
public static boolean Comparison(String s1,String s2){
	if(s1.length()!=s2.length()){
		return false;
	}
	if(s1.length()==0&&s2.length()==0){
		return true;
	}
	
	if(s1.charAt(0)!=s2.charAt(0)){
		return false;
	}
	return Comparison(s1.substring(1),s2.substring(1));
	
	
}
public static boolean comparison_2(String s1,String s2){
	if(s1.length()!=s2.length()){
		return false;
		
	}
	for(int i=0;i<s1.length();i++){
		if(s1.charAt(i)!=s2.charAt(i)){
			return false;
		}
	}
	return true;
}

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	String s2=s.next();
	System.out.println(Comparison(s1,s2));
	System.out.println(comparison_2(s1,s2));
}
}
