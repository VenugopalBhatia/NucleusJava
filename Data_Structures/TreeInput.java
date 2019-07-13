package Data_Structures;

import java.util.Scanner;

public class TreeInput {

	public static TreeNode<Integer> TreeInput() throws Exception{
		Scanner s=new Scanner(System.in);
		int data;
		System.out.println("Enter root ");
		data=s.nextInt();
		Queue<TreeNode<Integer>> pendingNodes=new Queue();
		TreeNode<Integer> root=new TreeNode(data);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()){
			TreeNode<Integer>currentNode=pendingNodes.dequeue();
			System.out.println("Enter no. of children of "+currentNode.data);
			data=s.nextInt();
			int size=data;
			for(int i=0;i<size;i++){
				System.out.println("Enter "+i+" child of "+ currentNode.data);
				data=s.nextInt();
				TreeNode<Integer> child=new TreeNode(data);
				currentNode.children.add(child)	;

				pendingNodes.enqueue(child);

			}

		}
		return root;
	}
	//public static void PrintT(TreeNode<Integer> root){
	//if(root==null){
	//	return;
	//}
	//String s=root.data+":";
	//for(int i=0;i<root.children)
	//	}
	//



	public static void main(String[] args)throws Exception {
		TreeNode<Integer> root=TreeInput();
	}
}
