package Data_Structures;

import java.util.Scanner;

public class Stack<T> {
 private Node<T> head;
 private int size=0;
 public boolean IsEmpty(){
		return head==null;
	}
public void push(T data){
	
	Node<T>element=new Node<>(data);
	
	if(head==null){
		head=element;
		
		
	}
	else{
		element.next=head;
		head=element;
	
	}
	size++;
}
public Node<T> pop()throws StackEmpty{
	if(IsEmpty()){
		throw  new StackEmpty();
	}
	else{
	Node<T> h=head;
	
	head=head.next;
	
	size--;
	return h;
	}
}
public void output(){
	Node<T> temp=head;
		while(temp!=null){
			
			System.out.println(temp.data);
			
			temp=temp.next;
			
		}
	}
public T outhead(){
	return head.data;
}
public Node<T> rethead(){
	return head;
}
}

	


