package Data_Structures;

public class SumNodeMax {
	public static TreeNode<Integer> SumNodeMax(TreeNode<Integer> root,TreeNode<Integer> largest){

		largest=root;
		for(int i=0;i<root.children.size();i++){
			largest.data=largest.data+root.children.get(i).data;
		}
		for(int i=0;i<root.children.size();i++){
			TreeNode<Integer> sumChild=SumNodeMax(root.children.get(i),largest);
			if(sumChild.data>largest.data){
				largest=sumChild;
			}
		}

		return largest;
	}
}
