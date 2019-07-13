
public class subsequences {
public static String[] sub(String s){
	if(s.length()==0){
		String smallOutput[]={""};
		return smallOutput ;
		
	}
	
	
	String[] smallOutput=sub(s.substring(1));
	String[] arr=new String[2*smallOutput.length];
	char a=s.charAt(0);
	for(int i=0;i<smallOutput.length;i++){
		arr[i]=smallOutput[i];
	}
	for(int k=smallOutput.length;k<arr.length;k++){
		arr[k]=a+smallOutput[k-smallOutput.length];
	}
	return arr;
	
}
public static void main(String[] args) {
	String arr[]=sub("abcd");
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
	
}
}
