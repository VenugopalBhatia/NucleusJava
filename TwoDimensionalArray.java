import java.util.Scanner;

public class TwoDimensionalArray {
	public static int[][] takeInput2D(){
		Scanner s =new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int rows=s.nextInt();
		System.out.println("Enter no. of columns");
		int columns =s.nextInt();
		int input[][]=new int[rows][columns];
		for(int i=0;i<rows;i++)
		{ for(int j=0;j<columns;j++){
			input[i][j]=s.nextInt();
		}
		}
		return input;


	}
	public static void print2D(int[][] arr){
		int rows=arr.length;
		int columns=arr[0].length;
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}



	public static void sum(int[][] arr){

		int rows=arr.length;
		int columns=arr[0].length;

		for(int i=0;i<rows;i++){
			int sum=0;
			for(int j=0;j<columns;j++){
				sum=sum+arr[i][j];
			}
			System.out.println("Sum for "+i+"row: "+sum);
		}



	}
	public static void max(int[][] arr){
		int max=Integer.MIN_VALUE;
		int rows=arr.length;
		int columns=arr[0].length;


		for(int i=0;i<rows;i++){
			int sum=0;
			for(int j=0;j<columns;j++){
				sum=sum+arr[i][j];
			}
			if(sum>max){
				max=sum;
			}}

		for(int l=0;l<columns;l++){
			int sum=0;
			for(int k=0;k<rows;k++){
				sum=sum+arr[k][l];
			}
			if(sum>max){
				max=sum;
			}
		}

		System.out.println("Maximum value is "+max);

	}
	public static void wave(int[][] arr){
		int rows=arr.length;
		int columns=arr[0].length;
		for(int j=0;j<columns;j++){
			if(j%2==0){
				for(int i=0;i<rows;i++){
					System.out.print(arr[i][j]);
				}}
			else{
				for(int k=rows-1;k>=0;k--){
					System.out.print(arr[k][j]);
				}
			}
		}
		System.out.println();
	}

public static void spiral(int[][] arr){
	int rows=arr.length;
	int columns=arr[0].length;
	int m=rows;
	int n=columns;
	
	int trackr=0;
	int trackc=0;
	int h=m;
	int v=n;
	int ho=m-1;
	int ve=n-1;
	int start1=0;
	int start2=1;
	int end3=0;
	int end4=1;
	
	
	for(int i=0;i<2*rows-1;i++){
		
		for(int b=start1;b<h;b++){
		
			System.out.print(arr[trackr][b]+" ");
			trackc=b;
			
			
		}
		h=h-1;
		start1++;
		
		for(int a=start2;a<v;a++){
			System.out.print(arr[a][trackc]+" ");
			trackr=a;
			
		}
		v=v-1;
		start2++;
		for(int c=ho-1;c>=end3;c--){
			System.out.print(arr[trackr][c]+" ");
			trackc=c;
			
			
				
			}
		ho=ho-1;
		end3++;
		for(int d=ve-1;d>=end4;d--){
			System.out.print(arr[d][trackc]+" ");
			trackr=d;
			
			
			}
		ve=ve-1;
		end4++;
		
	}
	
}
public static void Spiral(int[][]arr){
	int rows=arr.length;
	int columns=arr[0].length;
	int rowStart=0;
	int rowEnd=rows-1;
	int columnStart=0;
	int columnEnd=columns-1;
	while(columnStart<=columnEnd&&rowStart<=rowEnd)
	{
	for(int i=columnStart;i<=columnEnd;i++){
		
		System.out.print(arr[rowStart][i]+" ");
		
		
	}
	rowStart++;
	

	
	
	for(int j=rowStart;j<=rowEnd;j++){
		System.out.print(arr[j][columnEnd]+" ");
	}
	columnEnd--;
	
	
	
	for(int k=columnEnd;k>=columnStart;k--){
		if(rowStart<=rowEnd){
		System.out.print(arr[rowEnd][k]+" ");
	}
	}
	rowEnd--;
	
	
	for(int m=rowEnd;m>=rowStart;m--){
		System.out.print(arr[m][columnStart]+" ");
	}
	columnStart++;
	
	
	
	
}
}





	public static void main(String[] args) {
		int[][] array=takeInput2D();
		print2D(array);
		sum(array);
		max(array);
		wave(array);
		Spiral(array);

	}
}
