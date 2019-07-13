import java.util.Scanner;

public class Replacepi {
	public static String replacepi(String s,int i,String s2){
		
		
		if(i>=s.length()){
			return s2;
		}
		
		if(i<s.length()-1&&s.charAt(i)=='p'&&s.charAt(i+1)=='i'){
			s2=s2+"3.14";
			i=i+1;
		}
		
		else{	
			     
		if(i<=s.length()-1)
				{
			s2=s2+s.charAt(i);
				}
		}
				
				return replacepi(s,i+1,s2);
			
			
					
		
		}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String t=s.next();
		String s2="";
		System.out.println(replacepi(t,0,s2));
		
	}
	}


