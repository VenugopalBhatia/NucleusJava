
public class PalindromeSubStrings {
public static void palindrome(String s){
	int i=0;
	int j=s.length()-1;
	int arr[] =new int[256];
	int count=0;
	while(i<=s.length()-1){
		while(s.charAt(i)!=s.charAt(j)&&j>0){
			j--;
			
		}
		int t=i;
		while(t<s.length()&&j>0&&s.charAt(t)==s.charAt(j)&&t<j){
			t++;
			j--;
		
		if(t>=j){
			count++;
		}
		}
		
		j=s.length()-1;
		arr[s.charAt(i)]=arr[s.charAt(i)]+1;
		i++;
	}
	
	
	
	
	
	System.out.println(count);
}
public static void main(String[] args) {
	String s="bdbb";
	palindrome(s);
}
}
