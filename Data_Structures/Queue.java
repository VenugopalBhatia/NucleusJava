package Data_Structures;

public class Queue<T> {
private Node<T> front=null;
private Node<T> rear=null;
private int size=0;
public boolean isEmpty(){
	if(front==null){
		return true;
	}
	else{
		return false;
	}
	
}
public void enqueue( T data){
	Node<T> element=new Node(data);
if(isEmpty()){
	front=element;
	rear=element;
	size++;
}
else{
rear.next=element;
rear=element;
size++;
}
}
public T dequeue() throws Exception{
	if(isEmpty()){
		throw new Exception();
	}
	else{
	
	T s=front.data;
	front=front.next;
	size--;
	
	return s;
	}
	
}
public T getFront(){
	return front.data;
}
public Node<T> retFront(){
	return front;
}
public Node<T> getRear(){
	return rear;
}
public int retSize(){
	return size;
}

public void queueOutput(){
	Node<T> count=front;
	while(count!=null){
		System.out.print(count.data+"->");
		count=count.next;
	}
	System.out.println();
}



}
