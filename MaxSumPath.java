
public class MaxSumPath {
public static int max(int[] s1,int[] s2) {
	int i=0;
	int j=0;
	int common1;
	int common2;
	int sumS1=0;
	int sumS2=0;
	int sumMax=0;
	while(i!=s1.length-1&&j!=s2.length-1){
	if(i<s1.length&&j<s2.length&&s1[i]<s2[j]){
		i++;
	}else if(i<s1.length&&j<s2.length&&s1[i]>s2[j]){
		j++;
		
	}
	else{
		if(s1[i]==s2[j]){
			common1=s1[i];
			i++;
			j--;
		}
		while(s1[i]!=s2[j]){
			
		}
		
	if(sumS1>sumS2){
		sumMax=sumMax+sumS1;
	}else{
		sumMax=sumMax+sumS2;
	}
	}
	}
	return sumMax;
}

public static void main(String[] args) {
	int[] s1={2,5,6,8,9,13,15};
	int[] s2={1,2,3,4,6,7,9,29};
	System.out.println(max(s1,s2));
}
}
