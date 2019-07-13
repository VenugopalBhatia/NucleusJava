import java.util.Scanner;

public class FahrenheitModular {
public static void fahrenheit(int minTemp,int maxTemp,int step){
	int Fahrenheitvalue=minTemp;
	while(Fahrenheitvalue<=maxTemp)
	{
		int celsiusValue= (int)((5.0/9)*(Fahrenheitvalue-32));
		System.out.println(Fahrenheitvalue+" "+celsiusValue);
		Fahrenheitvalue=Fahrenheitvalue+step;
		
	}
	
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter minimum value of Temperature:");
	int min=s.nextInt();
	System.out.println("Enter maximum value of Temperature:");
	int max=s.nextInt();
	System.out.println("Enter Step size:");
	int size=s.nextInt();
	fahrenheit(min,max,size);
}
}
