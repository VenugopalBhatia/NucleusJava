package Data_Structures;

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
	public void pop()throws StackEmpty{
		if(IsEmpty()){
			throw  new StackEmpty();
		}
		else{
		
		System.out.println(head.data+" Popped");
		if(head.data==getMinimum.data){
			getMinimum=getMinimum.next;
		}
		head=head.next;
		}
		size--;
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
	
	
}
