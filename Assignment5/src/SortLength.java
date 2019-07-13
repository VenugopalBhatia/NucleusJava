import java.util.Scanner;

public class SortLength {
	public static void sortLength(String[] arr){
		for(int i=0;i<arr.length;i++){
			int min=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[min].length()>arr[j].length()){
					min=j;
				}
				
				
			}
			String temp;
			temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
	
	public static String[] takeInputSA(int size){
		String arr[]=new String[size];
		Scanner t=new Scanner(System.in);
		
		for(int i=0;i<size;i++){
			System.out.println("Enter the "+i+" element");
			arr[i]=t.nextLine();
		}
		
		
		return arr;
	}
	public static void display(String[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array of strings: ");
		int size=s.nextInt();
		String[] arr=takeInputSA(size);
		sortLength(arr);
		display(arr);
		
		
		
		
	}

}
