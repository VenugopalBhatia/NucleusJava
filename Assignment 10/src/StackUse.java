import java.util.Scanner;

public class StackUse {
public static void main(String[] args)throws Exception {
	EnqueueEfficient<Integer> t=new EnqueueEfficient();
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
	
}
}
