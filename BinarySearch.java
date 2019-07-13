
public class BinarySearch {
	public static boolean bSearch(int [] arr,int t){
		int i=0;
		int j=arr.length-1;
		if(i>=j){
			return false;
		}else{
			if(arr[i]==t||arr[j]==t||arr[(i+j)/2]==t){
				return true;
			}

			if(t>arr[(i+j/2)]){
				i=i+j/2;
				int small[]=new int[arr.length-i-1];
				for(int k=0;k<small.length;k++){
					small[k]=arr[k+i];
				}
				return bSearch(small,t);


			}else{
				if(t<arr[i+j/2]){
					j=i+j/2;
					int small[]=new int[arr.length-j-1];
					for(int k=0;k<small.length;k++){
						small[k]=arr[k+i];
					}
					return bSearch(small,t);
				}
			}
		}
		return false;


	}
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		System.out.println(bSearch(arr,7));
	}
}
