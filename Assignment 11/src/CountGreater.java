import Data_Structures.TreeNode;

public class CountGreater {
public static int countGreater(TreeNode<Integer> root,int x,int count){
		
		if(root.data>x){
			count++;
			
		}
		for(int i=0;i<root.children.size();i++){
			count=countGreater(root.children.get(i),x,count);
		}
		return count;
	}
}
