
public class Spiral2DArray {
	public static void Spiral(int[][]arr){
		int rows=arr.length;
		int columns=arr[0].length;
		int rowStart=0;
		int rowEnd=rows-1;
		int columnStart=0;
		int columnEnd=columns-1;
		while(columnStart>=columnEnd&&rowStart>=rowEnd)
		{
		for(int i=columnStart;i<=columnEnd;i++){
			
			System.out.print(arr[rowStart][i]+" ");
			
			
		}
		columnStart=columnEnd;
		
		columnEnd--;
		for(int j=rowStart;j<=rowEnd;j++){
			System.out.print(arr[j][columnStart]);
		}
		rowStart=rowEnd;
		rowEnd--;
		for(int k=columnStart;k>=columns-columnEnd;k--){
			System.out.print(arr[rowStart][k]);
		}
		columnStart=columnEnd;
		columnEnd--;
		for(int m=rowStart;m>=rows-rowEnd;m--){
			System.out.print(arr[m][columnStart]);
		}
		rowStart=rowEnd;
		rowEnd--;
		
		
		
		
	}
	}

}
