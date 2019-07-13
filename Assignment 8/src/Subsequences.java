
public class Subsequences {
	
public static String[] subsequences(String t,int i){
	if(i==t.length()){
		String l="";
		String smallOutput[]=new String[1];
		smallOutput[0]=l;
		return smallOutput;
	}
	
	String[] smallOutput=subsequences(t,i+1);
	String[] output=new String[2*smallOutput.length];
	for(int j=0;j<smallOutput.length;j++){
		output[j]=smallOutput[j];
	}
	for(int k=smallOutput.length;k<output.length;k++){
		output[k]=t.charAt(i)+smallOutput[k-smallOutput.length];
	}
	return output;
}
public static void main(String[] args) {
	String t="abc";
	String[] output=subsequences(t,0);
	for(int i=0;i<output.length;i++){
		System.out.println(output[i]);
	}
	
}
}
