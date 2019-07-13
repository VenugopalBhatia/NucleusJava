import java.util.Scanner;
public class HelloWorld {
	public static void main(String[]args){
		System.out.println("Hello World");
		System.out.println("Hello world"); 

		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value");
		n=s.nextInt();
		int nextNum=1;

		while(nextNum<=n){
			System.out.println(nextNum);
			nextNum=nextNum+1;

	}
	
	}

}
