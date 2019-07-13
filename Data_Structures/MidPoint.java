package Data_Structures;

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

public static void main(String[] args) {
	Node<Integer> head=LinkedListUse.takeInput();
    head=mid(head);
    System.out.println(head.data);
	
	
}
}
