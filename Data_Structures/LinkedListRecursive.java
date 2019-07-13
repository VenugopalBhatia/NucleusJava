package Data_Structures;

import java.util.Scanner;

public class LinkedListRecursive {
	public static Node<Integer>takeInput(){
		Node<Integer> head=null,tail=null;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter data:");
		int data=s.nextInt();
		while(data!=-1){
			Node<Integer> newNode=new Node<>(data);
			if(head==null){
				head=newNode;
				tail=newNode;
			}
			else{
				tail.next=newNode;
				tail=newNode;
			}
			System.out.println("Enter data:");
			data=s.nextInt();

		}
		return head;
	}
	public static void print(Node<Integer>temp){
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println();
	}
	public static int length(Node<Integer> temp){
		if(temp==null){
			return 0;
		}
		
		return length(temp.next)+1;
	}
	public static Node<Integer> Insert(Node<Integer> temp,Node<Integer> head,int i){
		if(i==0){
			temp.next=head;
			
			return temp;
			
		}
		head.next=Insert(temp,head.next,i-1);
		return head;
		
	}
	public static Node<Integer> Delete(int i,Node<Integer> head){
		if(i==0){
			head=head.next;
			return head;
		}
		head.next=Delete(i-1,head.next);
		return head;
	}
	
	public static void main(String[] args) {


		Node<Integer> head=takeInput();
		print(head);
		System.out.println(length(head));
		Node<Integer> temp=new Node<>(7);
//		printElement(0,head);
		head=Insert(temp,head,4);
		print (head);
		head=Delete(0,head);
		print(head);
	}
}
