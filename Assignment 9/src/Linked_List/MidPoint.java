package Linked_List;


public class MidPoint {
	public static Node<Integer> mid(Node<Integer> head){
		Node<Integer> fast=head;
		Node<Integer> slow=head;
		
		while(fast.next!=null&&fast.next.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			
		}
		return slow;
	}

}
