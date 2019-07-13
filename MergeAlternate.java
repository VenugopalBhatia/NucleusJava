import java.util.Scanner;


 class Node<T> {
	public T data;
	public Node<T> next;
	Node(T data){
		this.data=data;
	}
	}


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
		Node<Integer> temp=head;
		Node<Integer> tail1=head;
		Node<Integer> tail2=null;
		for(int i=1;i<length(head)/2;i++){
			temp=temp.next;
		}
		tail2=temp.next;
		temp.next=null;
		while(tail2.next!=null){
			temp=tail1.next;
			tail1.next=tail2;
			tail2=tail2.next;
			tail1.next.next=temp;
			tail1=temp;
			
		}
		if(tail2.next==null){
			tail1.next=tail2;
		}
	
	}
	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		mergeAlternate(head);
		print(head);
		
	}
}


