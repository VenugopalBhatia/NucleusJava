import java.util.Scanner;

public class Replace {
	public static String replace(String str,char ch1,char ch2,int i){
		if(i<0){
			String s="";
			return s;
		}
		String s=replace(str,ch1,ch2,i-1); // replace(str.subString(1)
		if(str.charAt(i)==ch1){
			s=s+ch2;
			return s;
		}
		else{
			s=s+str.charAt(i);
			return s;
		}
	}
	
		
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	char ch1=s.nextLine().charAt(0);
	char ch2=s.nextLine().charAt(0);
	System.out.print(replace(str,ch1,ch2,str.length()-1));

}
}
