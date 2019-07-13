package Data_Structures;

public class PrintNodesAtDepth {
	public static void printD(TreeNode<Integer> root,int k,int depth) throws Exception{
		if(k==0){
			System.out.println(root.data);
		}
		else{
		if(depth+1==k){
			for(int i=0;i<root.children.size();i++){
				System.out.print(root.children.get(i).data+" ");
			}
		}else
		{for(int i=0;i<root.children.size();i++)
			printD(root.children.get(i),k,depth+1);
		}
	}
	}
	
}
