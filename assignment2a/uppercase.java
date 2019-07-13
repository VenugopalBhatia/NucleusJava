package assignment2a;

import java.util.Scanner;

public class uppercase { public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Character:");
	char c = s.next().charAt(0);
	
	int n=c;
	
	if(n>=97&&n<=122)
	{System.out.println(c+" is lowercase");
	
	}
	else
		if(n>=65&&n<=90)
		{System.out.println(c+" is uppercase");
		
		
		}
		else
			
			System.out.println("Invalid character");
	
	
	
}

}
