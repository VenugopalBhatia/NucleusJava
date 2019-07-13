
public class FunctionsAndScope {

	
	public static int increment(int num){
	
		return num+1;
	}
	
	public static void a(){
		b();
		System.out.println("Inside a");
	}
	
	public static void b(){
		c();
		System.out.println("Inside b");
	}
	public static void c(){
		System.out.println("Inside c");
	}
	public static void main(String[] args) {
		int num = 20;
		a();
		System.out.println(num);
		System.out.println("Inside main");
		
		
//		int num = 10;
//		num = increment(num);
//		System.out.println(num);
		
//		int i = 10;
//		int a = 10;
//		while(i <= 2){
//			 a = 1;
//			System.out.println(a);
//			a++;
//			i++;
//		}
//
//		System.out.println(a);
	}

}
