package Linked_List;

public class Merge {
public static Node<Integer> merge(Node<Integer> head1,Node<Integer> head2){
	Node<Integer> tail3=null;
	Node<Integer> head3=null;
	if(head1.data<head2.data){
		head3=head1;
		tail3=head1;
		head1=head1.next;
		
	}
	else{
		head3=head2;
		tail3=head2;
		head2=head2.next;
	}
	while(head1!=null&&head2!=null){
		if(head1.data>head2.data){
			tail3.next=head2;
			head2=head2.next;
			tail3=tail3.next;
			
			
		}
		else{
			if(head1.data<head2.data){
			tail3.next=head1;
			head1=head1.next;
			tail3=tail3.next;
			
			}
		}
	}
	if(head1==null&&head2!=null){
		tail3.next=head2;
	}
	else{
		if(head2==null&&head1!=null){
			tail3.next=head1;
		}
	}
	return head3;
	
	
}
public static void main(String[] args) {
	Node<Integer> head1=LLR.takeInput();
	LLR.print(head1);
	Node<Integer>head2=LLR.takeInput();
	LLR.print(head2);
	Node<Integer>head3=merge(head1,head2);
	LLR.print(head3);
}
}
