import java.util.Scanner;

public class ReverseWord {
	public static void revWord(String s){
		int i=s.length()-1;
		int j=s.length()-1;

		String str="";
		while(i>=0){
			if(s.charAt(i)==' '||i==0){
				if(i==0){
					str=str+s.substring(i,j);
				}else{

					if(j==s.length()-1){
						str=str+s.substring(i+1,j+1);
						str=str+" ";
						j=i;
					}else{
						str=str+s.substring(i+1,j+1);
						j=i;
					}
				}
			}
			i--;
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		//	System.out.println(str);
		revWord(str);

	}

}
