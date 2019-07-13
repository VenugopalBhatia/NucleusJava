package Assignment2b;

public class Q5b {
	public static double squareRoot(int n,int numDecimalPlaces){
		double sqrt=0;
		int currentPos=0;
		double stepValue;
		while(currentPos<=numDecimalPlaces){
			stepValue=Math.pow(10, -1.0*currentPos);
			while(sqrt*sqrt<=n){
				sqrt=sqrt+stepValue;
			}
			sqrt=sqrt-stepValue;
			currentPos++;
			
				
			
			
		}
		return sqrt;
		
	}

}
