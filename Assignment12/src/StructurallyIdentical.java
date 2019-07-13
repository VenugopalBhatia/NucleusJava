

public class StructurallyIdentical {
	public static boolean StructurallyIdentical(BinaryTreeNode<Integer> root1,BinaryTreeNode<Integer> root2){
		if(root1==null&&root2==null){
			return true;
		}else
		   {if(root1==null||root2==null||root1.data!=root2.data){
			return false;
		}
		   }
		
		
		Boolean check= StructurallyIdentical(root1.left,root2.left);
		if(check){
			return StructurallyIdentical(root1.right, root2.right);
			}
		else{
			return check;
		}
		
	}
}
