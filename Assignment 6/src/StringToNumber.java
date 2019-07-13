import java.util.Scanner;

public class StringToNumber {
public static int stringToNumber(String s,int i){
	if(i==s.length()-1){
		return words(s.charAt(i));
	}
	
	int t=exponent(10,s.length()-i-1);
	int n=words(s.charAt(i));
	return n*(t)+stringToNumber(s,i+1);
}
public static int exponent(int m,int n){
	if(n==0){
		return 1;
	}
	
	return m*exponent(m,n-1);
}
public static int words(char s){

	int t=0;

	switch(s){
	case '0':t=0;
	break;
	case '1':t=1;
	break;
	case '2':t=2;
	break;
	case '3':t=3;
	break;
	case '4':t=4;
	break;
	case '5':t=5;
	break;
	case '6':t=6;
	break;
	case '7':t=7;
	break;
	case '8':t=8;
	break;
	case '9':t=9;
	break;
	
	}
	return t;
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String t=s.next();
	System.out.println(stringToNumber(t,0));
}
}
