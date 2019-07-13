
public class SpanOfStock {
//	Done without stack in o(n^2) time complexity
	public static int[] span(int[] arr){
		int si[]= new int[arr.length];
		for(int i=0;i<arr.length;i++){
			int count=i+1;
			for(int j=0;j<i;j++){
				if(arr[j]>arr[i]){
					count=i-j;
				}
			}
			si[i]=count;

		}
		return si;

	}
	//Done without Stack  in o(n)
	public static int[] span_2(int arr[]){
		int[] span=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++){
			index=i-1;
			span[i]=1;
			while(index>=0&&arr[index]<=arr[i]){
				span[i]=span[i]+span[index];
				index=index-span[index];// We skip the span of the element at index to go to the element greater than index element as that element may be smaller than the ith element
			}
		}
			return span;
		
	}
	//Done with Stack in o(n)
	public static int[] span_3(int[] stock)throws Exception{
		MinStack stack=new MinStack();
		int[] span=new int[stock.length];
		for (int i = 0; i < stock.length; i++) {
            int index = 0;
            span[i] = 1;
            while (!stack.IsEmpty() && stock[stack.outhead()] <= stock[i]) {
                index = stack.pop();
                span[i] = i - index + span[index];
            }
            stack.push(i);
        }

        return span;
	}
	public static void main(String[] args)throws Exception {
		int[] arr={6,10,4,2,8,9};
		int[] si=span(arr);
		for(int i=0;i<si.length;i++){
			System.out.print(si[i]+" ");
		}
		System.out.println();
		si=span_2(arr);
		for(int j=0;j<si.length;j++){
			System.out.print(si[j]+" ");
		}
		System.out.println();
		si=span_3(arr);
		for(int j=0;j<si.length;j++){
			System.out.print(si[j]+" ");
		}
		
	}
}
