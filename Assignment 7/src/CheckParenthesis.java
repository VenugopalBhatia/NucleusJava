
public class CheckParenthesis {
	public static boolean checkParenthesis(String s,int i,int j){
		
		

		if(i>=j&&s.charAt(i)!='('&&s.charAt(j)!=')'){
			return true;
		}
		
		if(i>=j&&(s.charAt(i)=='('||s.charAt(j)==')')){
			return false;
		}
		
		
		while(s.charAt(i)=='('&&s.charAt(j)==')'){
			i++;
			j--;
		}
		if(s.charAt(i)!='('&&i<j){
			i++;
		}
		if(s.charAt(j)!=')'&&i<j){
			j--;
		}
		
		return checkParenthesis(s,i,j);
		
		
		
		




	}

	public static void main(String[] args) {
		String s="()";
		
		System.out.println(checkParenthesis(s,0,s.length()-1));
	}
}
