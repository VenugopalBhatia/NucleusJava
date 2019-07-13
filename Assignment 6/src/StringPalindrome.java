import java.util.Scanner;

public class StringPalindrome {
	public static boolean stringPalindrome(String s,int i){
		if(s.length()-i-1<=i){
			return true;
			
		}
		if(s.charAt(i)!=s.charAt(s.length()-i-1)){
			return false;
		}
		
		boolean ans=stringPalindrome(s,i+1);
		return ans;
	}
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String t=s.next();
	System.out.println(stringPalindrome(t,0));
	
}

}
