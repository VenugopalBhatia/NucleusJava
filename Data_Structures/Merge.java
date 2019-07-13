package Data_Structures;

public class Merge {
public static Node<Integer> merge(Node<Integer> head1,Node<Integer> head2){
	Node<Integer> temp=null;
	Node<Integer> tail1=head1;
	Node<Integer> tail2=head2;
	if(head1.data<head2.data){
		temp=head1.next;
		
		
	}
	else{
		temp=head2.next;
		
	}
	while(tail1.next!=null&&tail2.next!=null&&temp.next!=null){
	if(temp.data>tail2.data){
		tail1.next=tail2;
		tail1=temp;
		tail2.next=temp;
		tail2=tail2.next;
		
	
		
		temp=temp.next;
	}
	else{
		temp=temp.next;
		tail1=tail1.next;
	}
	
		
	
	}
	if(head1.data<head2.data){
		return head1;
	}
	else{
		return head2;
	
}
}
public static void main(String[] args) {
	Node<Integer> head1=LinkedListUse.takeInput();
	Node<Integer> head2=LinkedListUse.takeInput();
	Node<Integer> head=merge(head1,head2);
	LinkedListUse.print(head);
	
}
}
