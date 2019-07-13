package Data_Structures;

public class SumTree {
public static int sum(TreeNode<Integer> root){
	int sum=0;
	
	int size=root.children.size();
	for(int i=0;i<size;i++){
		sum=sum+sum(root.children.get(i));
	}
	
	return sum+root.data;
	
}
public static void main(String[] args) throws Exception{
	TreeNode<Integer> root=TreeInput.TreeInput();
	System.out.println(sum(root));
}
}
