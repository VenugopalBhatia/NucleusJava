
public class RemoveDuplicateLetters {
public static String eliminate(String str,String s){
	
	if(str.length()==0){
		return s;
	}
	if(s.length()==0){
		s=s+str.charAt(0);
	}
		
	
	if(str.charAt(0)!=s.charAt(s.length()-1)){
		s=s+str.charAt(0);
	}
	str=str.substring(1);
	return eliminate(str,s);
	
	
}

public static void main(String[] args) 
	

{
	String s="bbbbbccbbbbcbbbaabba";
	String s2="";
	System.out.println(eliminate(s,s2));
}
}

