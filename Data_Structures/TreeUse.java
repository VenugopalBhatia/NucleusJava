package Data_Structures;

import java.util.Scanner;

public class TreeUse<T> {

	public static TreeNode<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data ");
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		System.out.println("Enter number of children of "+rootData);
		int numChild = s.nextInt();
		for(int i = 0; i < numChild; i++){
			TreeNode<Integer> child = takeInput();
			root.children.add(child);
		}
		return root;
	}

	public static TreeNode<Integer> takeInputLevelWise() throws Exception{
		Queue<TreeNode<Integer>> pendingNodes =  new Queue<>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data ");
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while(! pendingNodes.isEmpty()){
			TreeNode<Integer> currentNode = pendingNodes.dequeue();
			System.out.println("Enter number of children of "+currentNode.data);
			int numChild = s.nextInt();
			for(int i = 0; i < numChild; i++){
				System.out.println("Enter "+i+" child of "+ currentNode.data);
				int childData = s.nextInt();
				TreeNode<Integer> child = new TreeNode<Integer>(childData);
				currentNode.children.add(child);
				pendingNodes.enqueue(child);
			}	
		}
		return root;	
	}

	public static void printLevelWise(TreeNode<Integer> root) throws Exception{
		Queue<TreeNode<Integer>> pendingNodes =  new Queue<>();

		pendingNodes.enqueue(root);
		while(! pendingNodes.isEmpty()){
			TreeNode<Integer> currentNode = pendingNodes.dequeue();

			int numChild = currentNode.children.size();
			String toBePrinted = currentNode.data +" : ";
			for(int i = 0; i < numChild; i++){
				TreeNode<Integer> child = currentNode.children.get(i);
				toBePrinted += child.data +", ";
				pendingNodes.enqueue(child);
			}	
			System.out.println(toBePrinted);
		}	
	}

	public static int count(TreeNode<Integer> root){
		int count = 0;
		for(int i = 0; i < root.children.size(); i++){
			count = count + count(root.children.get(i));
		}
		return count + 1;
	}


	public static void printR(TreeNode<Integer> root){
		if(root == null){
			return;
		}

		String toBePrinted = root.data +" : ";

		for(int i = 0; i < root.children.size(); i++){
			toBePrinted += root.children.get(i).data +", ";
		}

		System.out.println(toBePrinted);

		for(int i = 0; i < root.children.size(); i++){
			printR(root.children.get(i));
		}
	}

	public static TreeNode<Integer> largest(TreeNode<Integer> root){

		TreeNode<Integer> largest = root;
		for(int i = 0; i < root.children.size(); i++){
			TreeNode<Integer> largestInChild = largest(root.children.get(i));

			if(largestInChild.data > largest.data){
				largest = largestInChild;
			}
		}
		return largest;
	}

	public static int CountLeaves(TreeNode<Integer> root,int count){
		if(root.children.size()==0){

			count=count+1;
		}
		else{
			for(int i=0;i<root.children.size();i++){
				count=CountLeaves(root.children.get(i),count);
			}

		}
		return count;

	}
	public static TreeNode<Integer> Secondlargest(TreeNode<Integer> root){

		TreeNode<Integer> largest = root;
		for(int i = 0; i < root.children.size(); i++){
			TreeNode<Integer> largestInChild = largest(root.children.get(i));

			if(largestInChild.data > largest.data){
				largest = largestInChild;
			}
		}

		return largest;
	}
	public static void greater(TreeNode<Integer> root,int n,MinStack t){

		if(root.data>n){

			t.push(root.data);
			return;

		}
		else{
			for(int i=0;i<root.children.size();i++){
				greater(root.children.get(i),n,t);
			}

		}
	}
	public static void printD(TreeNode<Integer> root,int k,int depth) throws Exception{
		if(k==0){
			System.out.println(root.data);
		}
		else{
			if(depth+1==k){
				for(int i=0;i<root.children.size();i++){
					System.out.print(root.children.get(i).data+" ");
				}
			}else
			{for(int i=0;i<root.children.size();i++)
				printD(root.children.get(i),k,depth+1);
			}
		}
	}
	public static int SumNodeMax(TreeNode<Integer> root,int largest,TreeNode<Integer> node){

		largest=root.data;
		for(int i=0;i<root.children.size();i++){
			largest=largest+root.children.get(i).data;
		}
		for(int i=0;i<root.children.size();i++){
			int sumChild=SumNodeMax(root.children.get(i),largest,node);
			if(sumChild>largest){
				largest=sumChild;
				node=root.children.get(i);
			}
			

		}

		return largest;
	}
	public static void depth(TreeNode<Integer> root,int depth){
	if(depth==0){
		root.data=depth;
		depth++;
	}
		for(int i=0;i<root.children.size();i++){
			TreeNode<Integer> smallChild=root.children.get(i);
			smallChild.data=depth;
			
		}
		for(int i=0;i<root.children.size();i++){
			depth(root.children.get(i),depth+1);
		}
	}
	public static int countGreater(TreeNode<Integer> root,int x,int count){
		
		if(root.data>x){
			count++;
			
		}
		for(int i=0;i<root.children.size();i++){
			count=countGreater(root.children.get(i),x,count);
		}
		return count;
	}
	
	

	
		
	






	// 1 3 2 3 4 1 15 0 0 0

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//		TreeNode<Integer> node = new TreeNode<Integer>(10);
		TreeNode<Integer> root = takeInputLevelWise();
		//		printR(root);
		printLevelWise(root);
		//		System.out.println();
		//		System.out.println(count(root));
//		System.out.println("No. of Leaves are:"+CountLeaves(root,0));
//		System.out.println(largest(root).data);
//		MinStack t=new MinStack();
//		greater(root,2,t);
//		System.out.println(t.min());
//		System.out.println("Elements at depth are:");
//		printD(root,1,0);
//		System.out.println();
//		System.out.println(SumNodeMax(root,0,root));
//		depth(root,0);
//		printLevelWise(root);
		System.out.println(countGreater(root,2,0));
	}

}


