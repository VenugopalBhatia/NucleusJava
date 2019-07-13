
public interface PhoneKeypad {

	public static String words(int n){

		String s="";


		switch(n){
		case 2:s="abc";
		break;
		case 3:s="def";
		break;
		case 4:s="ghi";
		break;
		case 5:s="jkl";
		break;
		case 6:s="mno";
		break;
		case 7:s="pqr";
		break;
		case 8:s="stuv";
		break;
		case 9:s="wxyz";
		break;

		}
		return s;
	}
	public static String[] phoneKeypad(int m){
		if(m/10==0){
			String t=words(m);
			String arr[]=new String[t.length()];
			for(int i=0;i<t.length();i++){
				
				arr[i]=String.valueOf(t.charAt(i));

			}
			return arr;
		}
		String[]smallOutput=phoneKeypad(m/10);
		String[] output=new String[smallOutput.length*words(m%10).length()] ;
		
		int t=0;
		
		for(int k=0;k<words(m%10).length();k++)
		{
			for(int j=0;j<smallOutput.length;j++)
			{
				output[t]=smallOutput[j]+words(m%10).charAt(k);
				t++;
			}
			
			
		}
		
		
		return output;



	}
	public static void main(String[] args) {
		int t=234;
		String[] arr=phoneKeypad(t);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

	}

}
