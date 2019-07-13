import java.util.Scanner;

public class pattern2 {
	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Value");
		n=s.nextInt();
		int row=1;
		
		while(row<=n)
		{
			int y=1;
			int col=1;
			while (y<=n-row)
				
			{
				System.out.print(" ");
				y=y+1;
			}
			int Value=row;
			
			while(col<=row)
				
			{
				System.out.print(Value);
				Value=Value+1;
				col=col+1;
				
				
				
			} col=1;
			Value=(2*row)-2;
			while(col<row){
				System.out.print(Value);
				Value=Value-1;
				col=col+1;
				
			}
				System.out.print("\n");	
				row=row+1;
		}
				
		
	}

}
