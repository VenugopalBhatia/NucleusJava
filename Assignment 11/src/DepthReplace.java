import Data_Structures.TreeNode;

public class DepthReplace {
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
}
