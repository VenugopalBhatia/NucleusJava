package Data_Structures;

public class LinkedListReverseRecursive {
	public static Node<Integer>llrr(Node<Integer> head){

		if(head.next==null){
			return head;
		}
		Node<Integer> temp=llrr(head.next);
		head.next.next=head;
		head.next=null;
		return temp;
	}
	public static void main(String[] args) {
		Node<Integer> head=LinkedListUse.takeInput();

		head=llrr(head);
		LinkedListUse.print(head);
	}
}
