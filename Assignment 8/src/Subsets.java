
public class Subsets {
	public static int[][] subsets(int input[],int i){
		if(i==input.length){
			int [][] output={{}};
			return output;
		}
		int smallOutput[][]=subsets(input,i+1);
		int output[][]=new int[2*smallOutput.length][];
		
		for(int j=0;j<smallOutput.length;j++){
			output[j]=new int[smallOutput[j].length];
			for(int k=0;k<smallOutput[j].length;k++){
				output[j][k]=smallOutput[j][k];
			}
				for(int l=0;l<smallOutput.length;l++){
					output[l+smallOutput.length]=new int[smallOutput[j].length+1];
					for(int m=0;m<smallOutput[l].length;m++){
               
				output[l+smallOutput.length][m+1]=smallOutput[l][m];
				}
				}

			
		}
	
	return output;


}
public static void main(String[] args) {
	int input[]={1,2,3,};
	int output[][]=subsets(input,0);
	for(int j=0;j<=output.length;j++){
		for(int k=0;k<output[j].length;k++){
			System.out.print(output[j][k]+" ");
		}
		System.out.println();
	}
}
}
