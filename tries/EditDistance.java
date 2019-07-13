package tries;

public class EditDistance {
	
	
public static int editDistance(String s,String t){
	if(s.length()==0){
		return t.length();
	}else{
	if(t.length()==0){
		return s.length();
	}}
	if(s.charAt(0)==t.charAt(0)){
		return editDistance(s.substring(1),t.substring(1));
	}
	return 1+ Math.min(editDistance(s, t.substring(1)),Math.min(editDistance(s.substring(1),t),editDistance(s.substring(1),t.substring(1))));
}

public static int editDistanceR(String s,String t,int[][] memo){
	int m=s.length();
	int n=t.length();
	if(m==0){
		memo[m][n]=t.length();
		return memo[m][n];
	}else{
	if(n==0){
		memo[m][n]=s.length();
		return memo[m][n];
	}}
	if(memo[m][n]!=-1){
		return memo[m][n];
	}else{
		if(s.charAt(0)==t.charAt(0)){
			return editDistanceR(s.substring(1),t.substring(1),memo);
		}
		memo[m][n]=1+ Math.min(editDistanceR(s, t.substring(1),memo),Math.min(editDistanceR(s.substring(1),t,memo),editDistanceR(s.substring(1),t.substring(1),memo)));
	
	}
	return memo[m][n];
}


	
	

public static void main(String[] args) {
	String s1="bgh";
	String s2="ggbh";
	int memo[][]=new int[4][5];
	for(int i=0;i<4;i++){
		for(int j=0;j<5;j++){
			memo[i][j]=-1;
		}
	}
	System.out.println(editDistance(s1,s2));
	System.out.println(editDistanceR(s1,s2,memo));
}
}
