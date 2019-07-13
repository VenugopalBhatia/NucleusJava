import Data_Structures.Stack;
import Data_Structures.StackEmpty;

import java.util.Scanner;

import Data_Structures.Node;
public class EnqueueEfficient<T> {
	private Stack<T> t=new Stack();
	private Stack<T> t2=new Stack();
	public void enqueue(T data){
		t.push(data);
	}
	public void dequeue()throws StackEmpty{
		while(t.rethead()!=null)
			{
			t2.push(t.pop().data);
			
			}
		t2.pop();
		while(t2.rethead()!=null){
			t.push(t2.pop().data);
		}
	}
	public void queueOutput(){
		Node<T> front=t.rethead();
			while(front!=null){
				System.out.print("<-"+front.data);
				front=front.next;
			}
	}
	public static void main(String[] args)throws StackEmpty {
		EnqueueEfficient<Integer> T=new EnqueueEfficient<Integer>();
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