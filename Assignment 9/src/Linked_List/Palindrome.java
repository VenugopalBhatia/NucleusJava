package Linked_List;

public class Palindrome {
	public static  boolean palindrome(Node<Integer> head){
		Node<Integer> m=MidPoint.mid(head);
		Node<Integer> temp=LLR.llrr(m);
	
		while(temp!=head&&head.data==temp.data){
			if(head.next!=null){
			head=head.next;
			}
			if(temp.next!=null){
			temp=temp.next;
			}
			
		}
		if(head==null&&temp==null||head==temp){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args) {
		Node<Integer> head=LLR.takeInput();
		System.out.println(palindrome(head));
		
	}
}
