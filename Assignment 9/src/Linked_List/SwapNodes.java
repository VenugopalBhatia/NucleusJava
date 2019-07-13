package Linked_List;

public class SwapNodes {
public static Node<Integer> swap(int i,int j,Node<Integer> head){
	int count=0;
	Node<Integer> temp=head;
	while(count<i){
		temp=temp.next;
		count++;
	}
	Node<Integer> t=temp;
	LLR.Delete(i,head);
	LLR.Insert(t,head,j-1);
	t=t.next;
	LLR.Delete(j, head);
	LLR.Insert(t, head, i);
	return head;
	
}
public static void main(String[] args) {
	Node<Integer> head=LLR.takeInput();
	LLR.print(head);
	head=swap(2,8,head);
	LLR.print(head);
	
}
}
