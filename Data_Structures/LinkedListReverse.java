package Data_Structures;

public class LinkedListReverse {
	public static Node<Integer>rev(Node<Integer> head){
		Node<Integer> next=null;
		Node<Integer> current=head;
		Node<Integer>prev=null;


		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			
		}
		head=prev;






		return head;

	}
	public static void main(String[] args) {
		Node<Integer> head=LinkedListUse.takeInput();
	    head=rev(head);
		LinkedListUse.print(head);
	}
}
