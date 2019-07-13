
public class LargestUniqueSubstring {
	public static void lues(String s){
		boolean arr[]=new boolean[256];
		int i=0;
		
		int max=0;
		String str2="";
		String str;
		int t=0;
		while(i<s.length()){
		 i=t;
		str="";
		while(i<s.length()&&!arr[s.charAt(i)]){
			str=str+s.charAt(i);
			
			arr[s.charAt(i)]=true;
			i++;

		}
		
		if(str.length()>max){
			str2=str;
			max=str2.length();
		}
			for(int k=t;k<i;k++){
				arr[s.charAt(k)]=false;
			}
			t++;

	}
		System.out.println(str2);
	}
	public static void lues2(String s){
		int arr[]=new int[256];
		for(int k=0;k<256;k++){
			arr[k]=-1;
		}
		
		int i=0;
		int cs=0;
		
		int max=0;
		String str2="";
		String str;
		boolean check=true;
		while(i<s.length()-1){
			if(check==false){
				str=""+s.charAt(cs);
			}else{
			
			check=false;
			
//			System.out.println(i);
			str="";
			}
		while(arr[s.charAt(i)]==-1||arr[s.charAt(i)]<cs){	
		str=str+s.charAt(i);
//		System.out.println(str);
		arr[s.charAt(i)]=i;
		check=true;
		if(i<s.length()-1){
		i++;
		}
	
		}
		
		if(check==false&&arr[s.charAt(i)]>=cs){
//			System.out.println(arr[s.charAt(i)]);
			cs=arr[s.charAt(i)]+1;
			i=cs+1;
		
//			System.out.println("cs "+s.charAt(i)+" "+cs);
		}
		
		
		
		if(str.length()>max){
			str2=str;
			max=str.length();
		}
			

	}
		System.out.println(str2);
	}
	
	
	public static void main(String[] args) {
		String s="bacadbghbjjjjjjc";
		lues(s)	;
        lues2(s);
	}
}

