
public class RecursionClassCode {



	public static int fact(int n){
		if(n == 0){
			return 1;
		}

		int smallAns =  fact(n - 1);
		int ans = n * smallAns;
		n = n + 1;
		return ans;
	}

	public static int fib(int n){
		if(n == 0 || n == 1){
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}

	public static String getString(int num){
		switch(num){
		case 0 :
			return "zero";
		case 1 :
			return "one";
		case 2 :
			return "two";
		case 3 :
			return "three";
		case 4 : 
			return "four";
		case 5 :
			return "five";
		}
		return "";
	}

	public static String numToString(int num){
		//		if(num == 0){
		//			return;
		//		}

		if(num <= 9){
			//			System.out.print(getString(num)+" ");
			return getString(num);
		}

		int lastDigit = num % 10;
		String smallAns = 	numToString(num / 10);
		String lastDigitString = getString(lastDigit);
		
		return smallAns + " "+lastDigitString;
	}
	
	public static boolean checkSorted(int[] input){
		if(input.length <= 1){
			return true;
		}
		if(input[0] > input[1]){
			return false;
		}
		int smallInput[] = new int[input.length - 1];
		for(int i = 1; i < input.length; i++){
			smallInput[ i - 1] = input[ i];
		}
		boolean smallAns = checkSorted(smallInput);
//		if(smallAns == true){
//			return true;
//		}
//		else{
//			return false;
//		}
		return smallAns;
	}
	
	// Given an array check if it contains 7
	public static boolean check7(int[] input){
		if(input.length == 0){
			return false;
		}
		if(input[0] == 7){
			return true;
		}
		int smallInput[] = new int[input.length - 1];
		for(int i = 1; i < input.length; i++){
			smallInput[ i - 1] = input[ i];
		}
		return check7(smallInput);
	}
	
	// Given an array , check if it contains 7 from beginIndex till end
	public static boolean check7_2(int[] input, int beginIndex){
		if(beginIndex >= input.length){
			return false;
		}
		if(input[beginIndex] == 7){
			return true;
		}
		boolean smallAns = check7_2(input, beginIndex + 1);
		return smallAns;
	}
	
	
	public static int firstIndex(int[] input){
		if(input.length == 0){
			return -1;
		}
		if(input[0] == 7){
			return 0;
		}
		int smallInput[] = new int[input.length - 1];
		for(int i = 1; i < input.length; i++){
			smallInput[ i - 1] = input[ i];
		}
		int smallIndex = firstIndex(smallInput);
		if(smallIndex == -1){
			return -1;
		}
		return 1 + smallIndex;
	}
	
	
	
	public static void allIndicesof7(int[] input, int[] output, int beginIndex){
		if(beginIndex >= input.length){
			return;
		}
		if(input[beginIndex] == 7){
			output[beginIndex] = 1;
		}
		allIndicesof7(input, output,beginIndex + 1);
	}
	
	public static void allIndicesof7_2(int[] input, int[] output, int beginIndex, int outputIndex){
		if(beginIndex >= input.length){
			return;
		}
		if(input[beginIndex] == 7){
			output[outputIndex++] = beginIndex;
		}
		allIndicesof7_2(input, output,beginIndex + 1,outputIndex);
	}

	
	public static int[] allIndicesof7_3(int[] input, int beginIndex){
		if(beginIndex >= input.length){
			int[] output = new int[0];
			return output;
		}
		int[] smallOutput = allIndicesof7_3(input, beginIndex + 1);
		if(input[beginIndex] != 7){
			return smallOutput;
		}
		else{
			int[] output = new int[smallOutput.length + 1];
			output[0] = beginIndex;
			for(int i = 0; i < smallOutput.length; i++){
				output[i + 1] = smallOutput[i];
			}
			return output;
		}
	}
	
	
	public static void selectionSort(int[] input, int beginIndex){
		if(beginIndex >= input.length - 1){
			return;
		}
		int min = input[beginIndex];
		int pos = beginIndex;
		for(int i = beginIndex+1; i < input.length; i++){
			if(input[i] < min){
				min = input[i];
				pos = i;
			}
		}
		if(pos != beginIndex){
			int temp = input[beginIndex];
			input[beginIndex] = min;
			input[pos] = temp;
		}
		selectionSort(input, beginIndex + 1);
	}
	
	public static String[] keypad(int input, String[] options){
		if(input == 0){
			String[] output = {""};
			return output;
		}
		int lastDigit = input % 10;
		String lastDigitOptions = options[lastDigit]; // 3
		String smallOutput[] = keypad(input / 10, options); // 2
		String output[] = new String[smallOutput.length * lastDigitOptions.length()];
		int k = 0;
		
			for(int i = 0; i < smallOutput.length; i++){
				for(int j = 0; j < lastDigitOptions.length(); j++){
				output[k] =  smallOutput[i] + lastDigitOptions.charAt(j) ;
				k++;
			}
		}
		//		for(int i = 0; i < smallOutput.length; i++){
		//			output[k] =  smallOutput[i] + lastDigitOptions.charAt(1) ;
		//					k++;
		//		}
		//		
		//		for(int i = 0; i < smallOutput.length; i++){
		//			output[k] =  smallOutput[i] + lastDigitOptions.charAt(2); 
		//					k++;
		//		}
		return output;
	}
	
	public static void printKeypad(String input, String outputSoFar, String[] options){
		if(input.length() == 0){
			System.out.println(outputSoFar);
			return;
		}  // 234
		String firstDigitOptions = options[input.charAt(0) - '0'];
		
		for(int i = 0; i < firstDigitOptions.length(); i++){
			printKeypad(input.substring(1), outputSoFar + firstDigitOptions.charAt(i), options);
		}
	}

	public static void  printSubsequences(String input, String outputSoFar){
		if(input.length() == 0){
			System.out.println(outputSoFar);
			return;
		} 
		printSubsequences(input.substring(1), outputSoFar);
		printSubsequences(input.substring(1), outputSoFar + input.charAt(0));
		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		//		System.out.println(fact(n));
		//		System.out.println(fib(n));
//		System.out.println(numToString(145));
		int[] input = {7,2,5,7,6};
//		System.out.println(firstIndex(input));
//		System.out.println(check7_2(input, 0));
//		int [] output = new int[input.length];
//		for(int i = 0; i < output.length; i++){
//			output[i] = -1;
//		}
//		
//		output = allIndicesof7_3(input, 0);
//		for(int i = 0; i < output.length; i++){
//			System.out.print(output[i] +" ");
//		}
		selectionSort(input, 0);
		for(int i = 0; i < input.length; i++){
			System.out.print(input[i] +" ");
		}
		
	


	// TODO Auto-generated method stub

	String options[] = {"","", "abc","def","ghi"};
	printSubsequences("abc", "");
//	String output[] = keypad(23, options); 
//	for(int i = 0; i < output.length; i++){
//		System.out.println(output[i]);
//	}
//	printKeypad("234", "", options);

	//		String input = "abc";
	//		String output[] = subsequences(input);
	//		for(int i = 0; i < output.length; i++){
	//			System.out.println(output[i]);
	//		}

//	int n = 4;
	//		System.out.println(fact(n));
	//		System.out.println(fib(n));
	//		System.out.println(numToString(145));
	//		int[] input = {7,2,5,7,6};
	//		System.out.println(firstIndex(input));
	//		System.out.println(check7_2(input, 0));
	//		int [] output = new int[input.length];
	//		for(int i = 0; i < output.length; i++){
	//			output[i] = -1;
	//		}
	//		
	//		output = allIndicesof7_3(input, 0);
	//		for(int i = 0; i < output.length; i++){
	//			System.out.print(output[i] +" ");
	//		}
	//		selectionSort(input, 0);
	//		for(int i = 0; i < input.length; i++){
	//			System.out.print(input[i] +" ");
	//		}

}

}

