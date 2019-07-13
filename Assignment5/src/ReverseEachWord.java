import java.util.Scanner;

public class ReverseEachWord {
	public static void reverse(String str){
		int n=str.length();
		int i=0;
		int k=0;
		while(i<n){
			while(i<n&&str.charAt(i)!=' '){
				i++;
			}

			for(int j=i-1;j>=k;j--){
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
			k=i+1;
			i=i+1;
		}

	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String word=s.nextLine();
		reverse(word);

	}
}
