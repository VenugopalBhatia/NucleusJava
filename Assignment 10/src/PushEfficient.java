import java.util.Scanner;

import Data_Structures.Queue;
public class PushEfficient <T>{
Queue<T> t=new Queue<>();
Queue<T> t2=new Queue<>();

public void push(T data){
	t.enqueue(data);
}
public void pop (int size)throws Exception{
	if(t.isEmpty()){
		return;
	}
	
	T a=t.dequeue();
	pop(size);
	t2.enqueue(a);

	
	if(t.isEmpty()&&t2.retSize()==size){
		t2.dequeue();
	}
	
	}
		
	
public static void main(String[] args) throws Exception {
	PushEfficient<Integer> T=new PushEfficient<Integer>();
	Scanner s=new Scanner(System.in);
	int size=0;
	System.out.println("Enter data :");
	int data=s.nextInt();
	while(data!=-1){
		if(data==-2){
			
			T.pop(size);
			data=s.nextInt();
			size--;
		}else{
			T.push(data);
			data=s.nextInt();
			size++;
		}
		
	}
	
}

}

	


