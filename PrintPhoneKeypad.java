
public class PrintPhoneKeypad {
public static void printPhoneKeypad(String input,String outputSoFar,String[]options){
	
	if(input.length()==0){
		
		System.out.println(outputSoFar);
		return;
	}
	String firstDigitOptions=options[input.charAt(0)-'0'];
	for(int i=0;i<firstDigitOptions.length();i++){
		printPhoneKeypad(input.substring(1),outputSoFar+firstDigitOptions.charAt(i),options);
	}
}
}
