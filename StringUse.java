import java.util.Scanner;


public class StringUse {

	public static void print(String input){
		for(int i = 0; i < input.length(); i++){
			System.out.println(input.charAt(i));
		}
		
	}
	
	
	public static void printSubstrings(String input){
		int length;
		for(length = 1; length <= input.length(); length++){
			for(int i = 0; i + length <= input.length(); i++){
				System.out.println(input.substring(i,i + length));
			}
		}	
	}

	
	public static void printSubstrings_2(String input){
		for(int i = 0; i < input.length(); i++){
			for(int j= i + 1; j <= input.length(); j++){
				System.out.println(input.substring(i, j));
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);
//		String str = s.next();
//		
//		String arr[] = new String[10];
//		for(int i = 0; i < arr.length; i++){
//			System.out.println(arr[i]);
//		}
		
		printSubstrings_2("abcd");
		
//		String str = "abcd";
//		System.out.println(str.substring(0, 0));
//		
//		print("abcde");
		
//		int arr[] = {1,2};
//		int arr2[] = {1,2};
//		if(arr == arr2){
//			System.out.println("true");
//		}
//		else{
//			System.out.println("false");
//		}
//	
//		String str = "hello";
//		
//		String str2 = "hello";
//		
//		System.out.println(str.charAt(1));
//		System.out.println(str.substring(1, 5));
//		System.out.println(str.substring(4));
//		System.out.println(str.length());
//		System.out.println(str.concat("Hello"));
//		
//		if(str==str2){
//			System.out.println("Equal");
		//}
		}
		
		

}
