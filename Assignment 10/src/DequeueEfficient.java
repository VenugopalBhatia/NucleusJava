import Data_Structures.Stack;
import Data_Structures.StackEmpty;
import Data_Structures.Node;
import java.util.Scanner;
public class DequeueEfficient<T> {
	Stack<T> t=new Stack();
	Stack<T> t2=new Stack();
	private Node<T> temp=t.rethead();
public void dequeue()throws StackEmpty{
	t.pop();
}
public void enqueue(T data)throws StackEmpty{
	if(t.rethead()==null){
		t.push(data);
	}else{
	while(t.rethead()!=null){
		
		t2.push(t.pop().data);
		
		}
	t2.push(data);
	while(t2.rethead()!=null){
		t.push(t2.pop().data);
	}
	}
	}

public void queueOutput(){
	Node<T> front=t.rethead();
		while(front!=null){
			System.out.print(front.data+"->");
			front=front.next;
		}
}
public static void main(String[] args) throws StackEmpty{
	DequeueEfficient<Integer> T=new DequeueEfficient<Integer>();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter data :");
	int data=s.nextInt();
	while(data!=-1){
		if(data==-2){
			T.dequeue();
			data=s.nextInt();
		}else{
			T.enqueue(data);
			data=s.nextInt();
		}
		
	}
	T.queueOutput();
}
}

