package Data_Structures;

import java.util.Scanner;

public class LinkedListUse {
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
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	public static void printElement(int i,Node<Integer> temp){
		int count=0;
		while(count<i&&temp!=null){
			temp=temp.next;
			count++;
		}
		if(count<i)
		{
			System.out.println("i greater than linked list length!!");
			return;
		}
		else{
			System.out.println(temp.data);
		}
	}
	public static Node<Integer> Insert(int i,Node<Integer> temp){
		
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		Node<Integer> newNode=new Node<>(data);
		Node<Integer> t=temp;
		int count=0;
		if(i==0){
			newNode.next=temp;
			temp=newNode;
			
		}
		else{
			while(count<i-1){
				if(temp==null){
					System.out.println("Cannot insert");
					return temp;
					
				}
				else{
				t=t.next;

				count++;
				}
				
			}
			
			newNode.next=t.next;
			t.next=newNode;
			

		}
		return temp;
	}
	public static Node<Integer> Delete(int i,Node<Integer> temp){
		int count=0;
		Node<Integer> t=temp;
		if(i==0){
			temp=temp.next;
			return temp;
		}
		while(count<i-1){
			t=t.next;
			count++;
		}
		t.next=t.next.next;
		
		return temp;
		}
	
	public static void main(String[] args) {


		Node<Integer> head=takeInput();
		print(head);
		System.out.println(length(head));
		printElement(0,head);
		head=Insert(0,head);
		print (head);
		head=Delete(3,head);
		print(head);
	}
}


