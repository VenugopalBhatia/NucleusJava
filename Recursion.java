
public class Recursion {
	public static int fact(int n){
		if(n==0){
			return 1;
		}
		int smallAns=fact(n-1);
		int ans=n*smallAns;

		return ans;

	}
	public static int fib(int n){
		if(n==0||n==1){
			return n;
		}
		return n+fib(n-1);
	}
	public static int exponent(int x,int n){
		if(n==1){
			return x;
		}
		int ans=exponent(x,n/2);
		if(n%2==0){
			return ans*ans;
		}
		else{
			return x*ans*ans;
		}
	}
	public static String words(int n){

		String s="";

		switch(n){
		case 0:s="zero";
		break;
		case 1:s="one";
		break;
		case 2:s="two";
		break;
		case 3:s="three";
		break;
		case 4:s="four";
		break;
		case 5:s="five";
		break;
		case 6:s="six";
		break;
		case 7:s="seven";
		break;
		case 8:s="eight";
		break;
		case 9:s="nine";
		break;

		}
		return s;
	}
	public static String numToString(int n){
		if(n==0){
			System.out.println(words(n)+" ");
			return words(n);
		}
		if(n<=9){
			//			System.out.print(words(n)+" ");
			return words(n);
		}
		String t="";
		int lastDigit=n%10;
		t=t+numToString(n/10);
		t=t+words(lastDigit);
		return t;











	}
	public static boolean sort(int[]n){
		if(n.length==0||n.length==1){
			return true;
		}

		if(n[0]>n[1]){
			return false;
		}

		int smallInput[]=new int[n.length-1];
		for(int i=1;i<n.length;i++){
			smallInput[i-1]=n[i];
		}
		boolean smallAns=sort(smallInput);
		return smallAns;

	}
	public static boolean arrayCheck(int[]n,int t){
		if(n.length==0){
			return false;
		}
		if(n.length==1&&n[0]==t){
			return true;
		}
		else if(n.length==1&&n[0]!=t){
			return false;
		}
		if(n[0]==t||n[n.length-1]==t){
			return true;
		}
		int smallInput[]=new int[n.length-2];
		for(int i=1;i<n.length-1;i++){
			smallInput[i-1]=n[i];

		}
		boolean smallAns=arrayCheck(smallInput,t);
		return smallAns;

	}
	public static int arrayIndex(int[]arr,int t,int startIndex){
		if(arr.length==0){
			return-1;
		}
		if(arr[0]==t){
			return startIndex;

		}
		int[]arr2=new int[arr.length-1];
		for(int i=1;i<arr.length;i++){
			arr2[i-1]=arr[i];
		}
		startIndex++;
		return arrayIndex(arr2,t,startIndex);
	}

	public static int lastIndex(int arr[],int t,int beginIndex,int r){

		if(beginIndex>=arr.length&&arr.length!=0){
			return r;
		}
		if(arr[beginIndex]==t){
			r=beginIndex;
		}
		int ans=lastIndex(arr,t,beginIndex+1,r);
		return ans;


	}



	public static int facto(int n){
		if(n == 0){
			return 1;
		}

		int smallAns =  fact(n - 1);
		int ans = n * smallAns;
		n = n + 1;
		return ans;
	}

	public static int fibo(int n){
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

	public static String numToStringV2(int num){
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























	public static void main(String[] args) {
		int n=5;
		//		System.out.println(fact(n));
		//		System.out.println(fib(n));
		System.out.println(exponent(5,4));
		//		System.out.println(words(4));
		//		System.out.println(numToString(12127));
		//		int array[]={1,2,4,5,7,7,6,7};
		//		System.out.println(arrayCheck(array,7));

		//		System.out.println(arrayIndex(array,7,0));
		//		System.out.println(lastIndex(array,7,0,0));


	}
}
