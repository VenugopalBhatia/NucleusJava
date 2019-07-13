package Linked_List;

public class MergeSort {
public static Node<Integer> mergeSort(Node<Integer> head1){
	if(head1.next==null||head1==null){
		return head1;
	}
//	Ask abt head1==null;
	Node<Integer>h1=MidPoint.mid(head1).next;
	MidPoint.mid(head1).next=null;
	h1=mergeSort(h1);
	head1=mergeSort(head1);
    return Merge.merge(h1,head1);
    
	
	
	
	
}
public static void main(String[] args) {
	Node<Integer> head1=LLR.takeInput();
	head1=mergeSort(head1);
	LLR.print(head1);
	
}
}
