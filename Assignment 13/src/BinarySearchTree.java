import java.util.Scanner;

public class BinarySearchTree {
public static void Insert(BinaryTreeNode<Integer> root,int data){
	
	
	
	if(data<root.data){
		if(root.left==null){
			BinaryTreeNode<Integer> t=new BinaryTreeNode<Integer>(data);
			root.left=t;
		}
		else{
			Insert(root.left,data);
		}
	}
		else if(data>root.data){
			if(root.right==null){
				BinaryTreeNode<Integer> t2=new BinaryTreeNode<Integer>(data);
				root.right=t2;
			}
			else{
				Insert(root.right,data);
			}
	}
}


}
