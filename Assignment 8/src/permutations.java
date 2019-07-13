
public class permutations {


	public static int fact(int n){
		if(n==0){
			return 1;
		}
		int smallAns=fact(n-1);
		int ans=n*smallAns;

		return ans;

	}

	public static String[] permutations(String s,int i){
		if(s.length()==1){
			String[] output=new String[1];
			output[0]=String.valueOf(s.charAt(0));
			return output;
		}
		char l=s.charAt(0);


		String t=s.substring(1);

		String[] out=permutations(t,i+1);
		String output[]=new String[fact(t.length()+1)];
		int j=0;
		int a=0;
		for(int k=0;k<out.length;k++){
			int m=0;
			while(j<=a+out[k].length()){

				output[j]=out[k].substring(0, m)+l+out[k].substring(m,out[k].length());

				j++;

				m++;


			}
			a=j;

		}
		return output;


	}
	
	public static void main(String[] args) {
		String s="abc";
		String[] output=permutations(s,1);
		for(int i=0;i<output.length;i++){
			System.out.println(output[i]);
		}
	}
}