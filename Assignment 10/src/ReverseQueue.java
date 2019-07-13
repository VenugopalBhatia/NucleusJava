import java.util.Scanner;

import Data_Structures.Queue;

public class ReverseQueue {
	public static void reverseQueue(Queue<Integer> t) throws Exception{
		if(t.isEmpty()){
			return;
		}
		int a=t.dequeue();
		reverseQueue(t);
		t.enqueue(a);

	}
	public static void main(String[] args) throws Exception {
		Queue t=new Queue();
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		while(data!=-1){
			if(data==-2){
				t.dequeue();
				data=s.nextInt();
				
			}
			else{
			t.enqueue(data);
			
			data=s.nextInt();
			}
			
		}
		t.queueOutput();
		reverseQueue(t);
		t.queueOutput();
		
	}
	}

