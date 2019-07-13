package assignment2a;

import java.util.Scanner;

public class average {public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter name");
	String n = s.nextLine();
	
	Scanner t = new Scanner(System.in);
	System.out.println("Enter marks of Subject 1");
	float marks1 = t.nextFloat();
	Scanner a = new Scanner(System.in);
	System.out.println("Enter marks of Subject 2");
	float marks2 = a.nextFloat();
	Scanner e = new Scanner(System.in);
	System.out.println("Enter marks of Subject 3");
	float marks3 = t.nextFloat();
	
	
	float low =0;
	
	if(marks1<=marks2&&marks1<=marks3){
		low = marks1;
		
		
	}
	else if(marks2<=marks1&&marks2<=marks3)
	{
		low = marks2;
	}
	else
		
		low = marks3;
	System.out.println(n);
	System.out.println("Average of the 2 best marks is:");
	System.out.println((marks1+marks2+marks3-low)/2);
	
	
}

}
