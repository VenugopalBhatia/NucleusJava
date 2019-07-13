
public class CountPalindromicSubstrings {
	public static void cps(String s){
		int p=1;
		
		int countOddP=0;
		int countEvenP=0;
		while(p<s.length()-1){
			int i=p-1;
			int j=p+1;
		while(i>-1&&j<s.length()){
			if(s.charAt(i)==s.charAt(j)){
				countOddP++;
			}
			i--;
			j++;
		}
		i=p-1;
		j=p;
		if(s.charAt(i)==s.charAt(j)){
			countEvenP++;
			j++;
			i--;
			while(i>0&&j<s.length()){
				if(s.charAt(i)==s.charAt(j)){
					countEvenP++;
				}
				i--;
				j++;
			}
		}
		p++;
		}
		System.out.println(countOddP);
		System.out.println(countEvenP);
		
		
}
	public static void main(String[] args) {
		String s="abaaaba";
		cps(s);
	}
}
