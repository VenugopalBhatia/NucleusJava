
public class AllIndices {
	public static void allIndices(int[] input,int[] output,int t,int beginIndex){
		if(beginIndex>=input.length){
			return;
		}
		if(input[beginIndex]==t){
			output[beginIndex]=1;
		}
		allIndices(input,output,t,beginIndex+1);
	}
	
	public static void allIndices_2(int input[],int [] output,int t,int beginIndex,int outputIndex){
		if(beginIndex>=input.length){
			return;
		}
		if(input[beginIndex]==t){
			output[outputIndex++]=beginIndex;
		}
		allIndices_2(input,output,t,beginIndex+1,outputIndex);
		
	}
	

}
