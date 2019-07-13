
public class SelectionSortRecursion {
	public static int[] selectionSortRecursion(int[] t,int n){
		int min=n;
		int i=n+1;
		
		
		if(n==t.length){
			return t;
		}
		while(i<=t.length-1-n){
		if(t[i]<=t[min]){
			min=i;
			i++;
		}
		else{
		i++;
		}
		}
			int temp=t[min];
			t[min]=t[n];
			t[n]=temp;
			
			
		
		
		
		n++;
		
		return selectionSortRecursion(t,n);
		
	}
	
	public static void main(String[] args) {
		int [] arr={5,4,3,2,1};
		
		int[] arr2=selectionSortRecursion(arr,0);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
