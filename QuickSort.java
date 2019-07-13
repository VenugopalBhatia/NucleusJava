
public class QuickSort {
	public static int pivotPos(int[] input,int beg,int end){
		int count=0;
		int t=beg+1;
		int l=end;
		while(t<=end)
		{
			if(input[beg]>=input[t]){
			count++;
		}
			t++;
		}
		t=beg;
		int temp=input[beg];
		input[beg]=input[count+beg];
		input[count+beg]=temp;
		
		while(t<l){
			if(input[t]<=input[count+beg]){
				t++;
			}
			if(input[l]>=input[count+beg]){
				l--;
			}

			if(input[t]>input[count+beg]&&input[l]<input[count+beg]){
				temp=input[t];
				input[t]=input[l];
				input[l]=temp;
				t++;
				l--;
			}
			
			
		}

		return beg+count;


	}

	public static void quickSort(int[] input,int beg,int end){
		if(beg>=end){
			return;

		}
		int PivotPos=pivotPos(input,beg,end);
		quickSort(input,beg,PivotPos-1);
		quickSort(input,PivotPos+1,end);

	}
	public static void main(String[] args) {
		int[] input={6,6,5,4,1};
		quickSort(input,0,input.length-1);
		for(int i=0;i<input.length;i++){
			System.out.println(input[i]);
		}
	}
}
