package Heap;

public class HeapUse {
public static void main(String[] args)throws Exception {
	int[] a={10,7,1,4,5,9};
	MaxHeap<Integer> heap=new MaxHeap<>();
	for(int i=0;i<a.length;i++){
		heap.Insert_2(a[i],a[i]);
		
	}
	while(!heap.IsEmpty()){
		heap.RemoveMax();
	}

}
}
