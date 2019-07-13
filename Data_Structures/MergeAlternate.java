package Data_Structures;

import java.util.Scanner;

public class MergeAlternate {

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

			data=s.nextInt();

		}
		return head;
	}
	public static void print(Node<Integer>temp){
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.print("-1");
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
	public static void mergeAlternate(Node<Integer> head){
		Node<Integer> tail1=head;
		Node<Integer> tail2=head;
		Node<Integer> temp=head;
		if(length(head)%2!=0){
			for(int i=0;i<(length(head)/2);i++){
				temp=temp.next;
			}
		}
		else{
			for(int i=0;i<(length(head)/2)-1;i++){
				temp=temp.next;
			}
		}
		tail2=temp.next;
		temp.next=null;
		temp=head.next;
		while(temp!=null&&tail2!=null){
			temp=tail1.next;
			tail1.next=tail2;
			tail2=tail2.next;
			tail1.next.next=temp;
			tail1=tail1.next.next;
			temp=tail1.next;
		}
		if(temp==null&&tail2!=null){
			tail1.next=tail2;
		}


	}
	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		mergeAlternate(head);
		print(head);

	}
}
