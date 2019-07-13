package Linked_List;

public class append {
public static Node<Integer> Append(Node<Integer> head,int i){
	int length=LLR.length(head);
	int count=1;
	Node<Integer> temp=head;
	Node<Integer> temp2=head;
	if(length<=i){
		System.out.println("Error!!");
		return head;
	}
	while(temp2.next!=null){
		temp2=temp2.next;
		
	}
	temp2.next=head;
	
	while(count<length-i){
		temp=temp.next;
		count++;
	}
	temp2=temp.next;
	temp.next=null;
	
	return temp2;
}
public static void main(String[] args) {
	Node<Integer> head=LLR.takeInput();
	head=Append(head,2);
	LLR.print(head);
}
}
