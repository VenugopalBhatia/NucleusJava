import java.util.Scanner;

public class ReverseStringRecursive {
public static void reverseStringRecursive(String s,int beginIndex){
	if(beginIndex>=s.length()){
		return;
	}
	System.out.print(s.charAt(s.length()-beginIndex-1));
	
	reverseStringRecursive(s,++beginIndex);
	
	
	
	
}

public static void main(String[] args) {
	String s;
	Scanner t=new Scanner(System.in);
	s=t.nextLine();
	reverseStringRecursive(s,0);
		
}
}
