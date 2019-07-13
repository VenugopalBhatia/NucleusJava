
public class MergeTwoArrays {
	public static int[] mergeTwoArrays(int[] a1,int[] a2){
		int i=0,j=0;
		int k=0;
		int[] a3=new int[a1.length+a2.length];
		while(k<a1.length+a2.length){
		while(j<a1.length&&i<a2.length){
			if(a1[j]>a2[i]){
				a3[k]=a2[i];
				i++;
				k++;
			}
			else
			{
				a3[k]=a1[j];
				j++;
				k++;
			}
		}
		if(j==a1.length&&i<a2.length){
			a3[k]=a2[i];
			i++;
			k++;
		}
		else{
			if(i==a2.length&&j<a1.length){
				a3[k]=a1[j];
				j++;
				k++;
			}
		}
		}
		return a3;
	}

	public static void mergeSort(int[] arr){
		if(arr.length<=1){
			return;
		}
		int t=(arr.length)/2;
		int j=0;
		int arr1[]=new int[t];
		int arr2[]=new int[arr.length-t];
		for(int i=0;i<t;i++){
			arr1[i]=arr[i];
		}
		for(int i=t;i<arr.length;i++){
			arr2[j]=arr[i];
			j++;
		}
		mergeSort(arr1);
		mergeSort(arr2);
		int[] temp = mergeTwoArrays(arr1,arr2);
		for(int i=0; i<temp.length; i++){
			arr[i]=temp[i];
		}
	}

	public static void main(String[] args) {
//		int[] a1={5};
//		int[] a2={9,10};
//		int arr[]=mergeTwoArrays(a1,a2);
//		for(int i=0;i<arr.length;i++){
//			System.out.print(arr[i]+" ");
//		}

				int[] arr={12,6,1,5,9,10};
				mergeSort(arr);
				for(int i=0;i<arr.length;i++){
					System.out.print(arr[i]+" ");
				}

	}
}
