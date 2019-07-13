package Heap;

import java.util.ArrayList;

public class MaxHeap<V> {
	ArrayList<PQPair<V>> heap;
	public MaxHeap(){
		heap=new ArrayList<>();
	}
	public int size(){
		return heap.size();
	}
	public boolean IsEmpty(){
		return size()==0;
	}
	public void Insert(int Priority,V Value){
		PQPair newNode=new PQPair();
		newNode.Priority=Priority;
		newNode.Value=Value;

		heap.add(newNode);
		int Child=heap.size()-1;
		int Parent=(Child-1)/2;
		PQPair<V> child=heap.get(Child);
		PQPair<V> parent=heap.get(Parent);

		while(Child>0){
			if(child.Priority<=parent.Priority){
				return;
			}
		if(heap.get(Parent).Priority<heap.get(Child).Priority){
			heap.set(Parent, child);
			heap.set(Child, parent);
		}
			Child=Parent;
			Parent=(Child-1)/2;
			
		}

	}
	public void Insert_2(int Priority,V Value){
		PQPair newNode=new PQPair();
		newNode.Priority=Priority;
		newNode.Value=Value;

		heap.add(newNode);
		heapify(heap.size()-1);
		
		
	}
	public void heapify(int Index){
		if(Index==0){
			return;
		}
		else{int Parent=(Index-1)/2;
			if(heap.get(Parent).Priority<heap.get(Index).Priority){
		
			
			PQPair<V> child=heap.get(Index);
			PQPair<V> parent=heap.get(Parent);
			heap.set(Parent, child);
			heap.set(Index, parent);
			Index=Parent;
			Parent=(Index-1)/2;
			

		}else{
			return;
		}
	}
}
	public void RemoveMax()throws Exception{
		if(size()==0){
			throw new Exception();
		}
		System.out.println(heap.get(0).Value);
		heap.set(0,heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		deheapify(0);
	}
	public void deheapify(int Index) throws Exception{
		
		int leftChildIndex=2*Index+1;
		int rightChildIndex=2*Index+2;
		int Max=Index;
		if(leftChildIndex>heap.size()-1){
			return;
		}
			if(heap.get(Max).Priority<heap.get(leftChildIndex).Priority){
				Max=leftChildIndex;
			}
			if(rightChildIndex<heap.size()&&heap.get(Max).Priority<heap.get(rightChildIndex).Priority){
				Max=rightChildIndex;
			}
			if(Max!=Index){
				PQPair<V> child=heap.get(Max);
				PQPair<V> parent=heap.get(Index);
				heap.set(Index, child);
				heap.set(Max, parent);
				Index=Max;
				deheapify(Index);
			}else{
				return;
			}
		}
	}
	

