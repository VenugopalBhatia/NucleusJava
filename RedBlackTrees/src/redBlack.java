import java.util.Scanner;

public class redBlack {
	public static void BlackHeightPath(nodeRB<Integer> root){
		
		
	}
//	public static int BlackHeight(nodeRB<Integer> root){
//		if(root==null){
//			return 1;
//		
//		}
//		if(root.colour=='b'){
//		return Math.max(BlackHeight(root.left),BlackHeight(root.right))+1;
//		
//		}else{
//			return Math.max(BlackHeight(root.left),BlackHeight(root.right));
//		}
//		
//	}
	
	public static boolean Insert(nodeRB<Integer> root,int data){
		
		boolean checkRed=true;
		
		if(data<root.data){
			if(root.left==null){
				nodeRB<Integer> t=new nodeRB<Integer>(data);
				root.left=t;
				if(root.colour=='r'){
					checkRed=false;
				}
			}
			else{
				Insert(root.left,data);
			}
		}
			else if(data>root.data){
				if(root.right==null){
					nodeRB<Integer> t2=new nodeRB<Integer>(data);
					root.right=t2;
					if(root.colour=='r'){
						checkRed=false;
					}
				}
				else{
					Insert(root.right,data);
				}
		}
		
		return checkRed;
	}
//public static boolean checkRedSiblings(nodeRB root){
//if(root.colour=='r'){
//	if(root.left.colour=='r'){
//		
//		return false;
//	}else
//		if(root.right.colour=='r'){
//			
//			return false;
//		}
//}
//checkRedSiblings(root.left);
//checkRedSiblings(root.right);
//
//return null;
//		
//}
	
	public static nodeRB<Integer> RetParent(nodeRB<Integer> root,Integer data1){
		
		
		if(data1==root.left.data)
		{   
			return root;
		}else
		if(data1==root.right.data)
		{   
			return root;
		}
		RetParent(root.left,data1);
		RetParent(root.right,data1);
		
		return null;
	}
public static int RetParentS(nodeRB<Integer> root,Integer data1){
		int sibling=3;
		
		if(data1==root.left.data)
		{   sibling=0;
			return sibling;
		}else
		if(data1==root.right.data)
		{   sibling=1;
			return sibling;
		}
		RetParentS(root.left,data1);
	    RetParentS(root.right,data1);
	    return sibling;
		
		
	}

public static void Insert(nodeRB<Integer> root){
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter data to be inserted");
	int data;
	data=s.nextInt();
	nodeRB nodeN=new nodeRB<Integer>(data);
	
	if(root==null){
	nodeN.colour='b';
	
	
	
	}
	 
	boolean check=Insert(root,data);
	if(check==false){
		
		 nodeRB Parent=RetParent(root,data);
		 
		 
		 nodeRB Parent1=RetParent(root,Parent.data);
		 
		  int sibling=RetParentS(root,Parent.data);
		 
		 if(sibling==1){
			 if(Parent1.left.colour=='r'){
				Parent.left.colour='b';
				if(Parent!=root){
				Parent.colour='r';
				}
				Parent.right.colour='b';
				
			 }
		 }
		 
		 
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}

private static int RetParentS(nodeRB<Integer> root, int data) {
	// TODO Auto-generated method stub
	return 0;
}
}
