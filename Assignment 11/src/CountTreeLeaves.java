import Data_Structures.TreeNode;
public class CountTreeLeaves<T> {
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

}
