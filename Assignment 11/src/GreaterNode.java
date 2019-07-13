import Data_Structures.MinStack;
import Data_Structures.TreeNode;;
public class GreaterNode {
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
}
