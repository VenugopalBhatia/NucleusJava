import java.util.Scanner;

public class idCheck {
	Scanner s=new Scanner(System.in);
	String str=s.next();
	void check(String str) throws Exception{
		int i=0;

		char One= str.charAt(i);

		if(One=='O'||One=='P'||One=='Q'){
			if(str.length()>6||str.charAt(1)<91||str.charAt(1)>100||str.charAt(2)<001||str.charAt(2)>026||str.charAt(2)<91 ||str.charAt(2)>100||str.charAt(3)<001||str.charAt(3)>026||str.charAt(3)<91 ||str.charAt(3)>100||str.charAt(4)<001||str.charAt(4)>026||str.charAt(4)<91 ||str.charAt(4)>100||str.charAt(5)<91 ||str.charAt(5)>100){
				throw new Exception();
			}
		}


	}


}

