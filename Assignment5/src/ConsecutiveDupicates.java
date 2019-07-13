import java.util.Scanner;

public class ConsecutiveDupicates {
	public static void ConsecutiveDuplicates(String str){
		System.out.print(str.charAt(0));
		
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)!=str.charAt(i-1)){
				
				System.out.print(str.charAt(i));
			}
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String consecutive=s.next();
		ConsecutiveDuplicates(consecutive);
			
		
	}

}

