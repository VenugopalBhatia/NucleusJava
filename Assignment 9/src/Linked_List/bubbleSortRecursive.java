package Linked_List;
//Error with the program:Sorts all elements but first
public class bubbleSortRecursive {
public static Node<Integer> bubbleSort(Node<Integer> head,int count){
	if(head==null||head.next==null){
		return head;
	}
	Node<Integer> temp=null;
	Node<Integer> temp2=null;
//if(count==0){
//	Node<Integer> t=new Node(head.data);
//	t.data=head.data;
//	t.next=head;
//	while(t.next.next!=null&&t.next.data>t.next.next.data){
//		temp2=t.next.next;
//		t.next.next=temp2.next;
//		temp2.next=t.next;
//		t.next=temp2;
//		t=t.next;
//		count++;
//	}
//	return head;
//	
//	
//}
//else{
	head.next=bubbleSort(head.next,count);
	
	temp=head;
	
	while(temp.next.next!=null&&temp.next.data>temp.next.next.data){
		temp2=temp.next.next;
		temp.next.next=temp2.next;
		temp2.next=temp.next;
		temp.next=temp2;
		temp=temp.next;
		count++;
		
	}
	return head;

}
public static void main(String[] args) {
	Node<Integer> head=LLR.takeInput();
	head=bubbleSort(head,0);
	
	LLR.print(head);
}
}
