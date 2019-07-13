import java.util.Scanner;

public class ConsecutiveDuplicatesCompression {
	public static void consecutiveCompress(String str){
		
		int i=1;
		while(i<=str.length()){
			int count=1;
			while(i<str.length()&&str.charAt(i)==str.charAt(i-1)){
				count++;
				i++;
				
			}
			System.out.print(str.charAt(i-1));
			if(count>1){
				System.out.print(count);
			}
			i++;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String com=s.nextLine();
		consecutiveCompress(com);
	}

}
