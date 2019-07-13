import java.util.Scanner;

public class ReverseWord {
	public static void reverse(String str){
		String temp="";
		int n=str.length();
		for(int i=0;i<n;i++){
			temp=temp+str.charAt(n-i-1);
			
		}
		System.out.println(temp);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String word=s.nextLine();
		reverse(word);
	}

}

