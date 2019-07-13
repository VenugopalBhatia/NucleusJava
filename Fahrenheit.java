
public class Fahrenheit {
	public static void main(String[] args) {
	int Fahrenheitvalue=0;
	int minFahrenheitvalue=0;
	int maxFahrenheitvalue=300;
	 
	while(Fahrenheitvalue<=maxFahrenheitvalue)
	{
		int celsiusValue= (int)((5.0/9)*(Fahrenheitvalue-32));
		System.out.println(Fahrenheitvalue+" "+celsiusValue);
		Fahrenheitvalue=Fahrenheitvalue+20;
		
	}
	
	
	}

}
