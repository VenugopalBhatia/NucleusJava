import java.util.Scanner;

public class ReverseString {

	public static void reverse(String str){
	
	String[] Str=new String[str.length()];
	int i=0;
	int j=0;
	int k=0;
	
	while(i<str.length()){
		
		while(i!=str.length()&&str.charAt(i)!= ' '){
			i++;
		}
	  
		Str[j]=str.substring(k,i);
		//if(i<str.length()){
		k=i+1;
		j++;
		i++;
		
	}
		
		
		
	
	for(int l=Str.length-1;l>=0;l--){
		if(Str[l]!=null){
		System.out.print(Str[l]+" ");
		}
	}
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();

		
		reverse(a);
		
	}

}

