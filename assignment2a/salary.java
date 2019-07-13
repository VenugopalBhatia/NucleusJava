package assignment2a;

import java.util.Scanner;

public class salary {public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Basic");
	float basic = s.nextFloat();
	Scanner t = new Scanner(System.in);
	System.out.println("Enter Grade:A, B or C");
	char c = t.next().charAt(0);

	int n=c;
	float allow = 0;
	if(n==65)
	{ allow=1700;

	}

	else
		if(n==66)
		{ allow=1800;
		}
		else
			if(n==67)
			{allow=1900;}
			else
				System.out.println("Invalid character");

	float hra=(float)(0.2*basic);
	float da=(float)(0.5*basic);

	float pf=(float)(0.11*basic);

	float tsal=(float)(hra+da+allow-pf);

	System.out.println("Total Salary="+tsal);




}
}






