
public class BubbleSort {
	public static int[] bubbleSort(int[] t,int n){
		int i=0;
		if(t.length==0||t.length==1){
			return t;
			
		}
		if(n>=t.length-1){
			return t;
		}
		while(i<t.length-n-1){
		if(i<t.length-1&&t[i]>t[i+1]){
			int temp=t[i];
			t[i]=t[i+1];
			t[i+1]=temp;
			i++;
		}
		else{
			i++;
		}
		}
		return bubbleSort(t,n+1);
	}
public static void main(String[] args) {
	int[] arr={3,5,1,2};
	int[] arr2=bubbleSort(arr,0);
	for(int i=0;i<arr.length;i++){
		System.out.print(arr2[i]+" ");
	}
}
}
