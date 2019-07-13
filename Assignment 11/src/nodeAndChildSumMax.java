import Data_Structures.TreeNode;
public class nodeAndChildSumMax {
public static TreeNode<Integer> nodeAndChildSumMax(TreeNode<Integer> root){
		
		TreeNode<Integer> ans = root;
		int sum = root.data;
		for(int i = 0; i < root.children.size(); i++){
			sum += root.children.get(i).data;
		}
		for(int i = 0; i < root.children.size(); i++){
			TreeNode<Integer> childAns = nodeAndChildSumMax(root.children.get(i));
			int childSum = childAns.data;
			for(int j = 0; j < childAns.children.size(); j++){
				childSum += childAns.children.get(i).data;
			}
			if(childSum > sum){
				sum = childSum;
				ans = childAns;
			}
		}
		return ans;
	}
}
