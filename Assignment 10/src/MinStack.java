
import java.util.Scanner;

import Data_Structures.StackEmpty;

public class MinStack {

	private Node<Integer> head;
	private Node<Integer> getMinimum;
		
	 private int size=0;
	 public boolean IsEmpty(){
			return head==null;
		}
	public void push(int data){
		
		Node<Integer> element= new Node(data);
		
		if(head==null){
			head=element;
			Node<Integer> element2=new Node(data);
			getMinimum=element2;
			
			
		}
		else{
			element.next=head;
			head=element;
			if(element.data<getMinimum.data){
				Node<Integer> element2=new Node<>(element.data);
				element2.next=getMinimum;
				getMinimum=element2;
				
		
			}
		
		}
		size++;
	}
	public int pop()throws StackEmpty{
		int h=0;
		if(IsEmpty()){
			throw  new StackEmpty();
		}
		else{
		
		System.out.println(head.data+" Popped");
		if(head.data==getMinimum.data){
			getMinimum=getMinimum.next;
		}
		 h=head.data;
		head=head.next;
		}
		size--;
		
		return h;
	}
	public void output(){
		Node<Integer> temp=head;
			while(temp!=null){
				
				System.out.println(temp.data);
				
				temp=temp.next;
				
			}
		}
	public Integer outhead(){
		return head.data;
	}
	public Node<Integer> rethead(){
		return head;
	}
	public Integer min(){
		return getMinimum.data;
	}
	
	public static void main(String[] args)throws StackEmpty {
		MinStack t=new MinStack();
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		while(data!=-1){
			if(data==-2){
				t.pop();
				System.out.println("Minimum most element in stack is: "+t.min());
				data=s.nextInt();
			}else{
			t.push(data);
			System.out.println("Minimum most element in stack is: "+t.min());
			data=s.nextInt();
			}
		}
		
	}
	}

