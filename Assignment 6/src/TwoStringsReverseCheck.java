import java.util.Scanner;

public class TwoStringsReverseCheck {
	public static boolean twoStringsReverseCheck(String s1,String s2,int i ){
		if(s1.length()!=s2.length()){
			return false;
		}
		
		
		if(i>=s1.length()){
			return true;
		}
		if(s1.charAt(i)!=s2.charAt(s2.length()-i-1)){
			return false;
		}
		boolean ans=twoStringsReverseCheck(s1,s2,i+1);
		return ans;
		
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		
		System.out.println(twoStringsReverseCheck(s1,s2,0));
	}
	
	

}
