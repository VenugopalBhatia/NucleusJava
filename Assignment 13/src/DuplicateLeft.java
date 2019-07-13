
public class DuplicateLeft {
	public static void Duplicateleft(BinaryTreeNode<Integer> root){
		if(root==null){
			return;
		}else{
		BinaryTreeNode<Integer> temp=new BinaryTreeNode<Integer>(root.data);
		
		BinaryTreeNode<Integer> temp2=root.left;
		root.left=temp;
		temp.left=temp2;
		Duplicateleft(root.left.left);
		Duplicateleft(root.right);

		
		}
	}
}

