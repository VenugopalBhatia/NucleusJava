package Data_Structures;

import java.util.Scanner;

public class BinaryTreeUse {
	public static BinaryTreeNode<Integer> input() throws Exception{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter root data:");
		int data=s.nextInt();
		BinaryTreeNode<Integer> root=new BinaryTreeNode(data);
		Queue<BinaryTreeNode<Integer>> pendingNodes=new Queue();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()){
			BinaryTreeNode<Integer> d=pendingNodes.dequeue();
			System.out.println("Enter data for left node:");
			int left=s.nextInt();
			if(left!=-1){
				BinaryTreeNode<Integer> leftS=new BinaryTreeNode<Integer>(left);
				d.left=leftS;
				pendingNodes.enqueue(leftS);
			}
			System.out.println("Enter data for right node:");
			int right=s.nextInt();
			if(right!=-1){
				BinaryTreeNode<Integer> rightS=new BinaryTreeNode<Integer>(right);
				d.right=rightS;
				pendingNodes.enqueue(rightS);
			}


		}
		return root;
	}
	public static void output(BinaryTreeNode<Integer> root){
		System.out.print(root.data+":");
		if(root.left!=null){
			System.out.print(root.left.data+",");
		}
		if(root.right!=null){
			System.out.print(root.right.data+",");
		}
		System.out.println();
		if(root.left!=null){
			output(root.left);
		}
		if(root.right!=null){
			output(root.right);
		}
	}
	public static BinaryTreeNode<Integer> mirror(BinaryTreeNode<Integer> root){
		if(root==null){
			return root;
		}
		else{

			if(root.left==null&&root.right==null){
				return root;
			}
			else{
				BinaryTreeNode<Integer> data=root.left;
				root.left=root.right;
				root.right=data;
				mirror(root.left);
				mirror(root.right);
				return root;
			}
		}
	}
	public static int height(BinaryTreeNode<Integer> root){
		if(root==null){
			return 0;
		}
		int heightl=0;
		int heightr=0;
		int height=0;
		heightl=heightl+height(root.left);
		heightr=heightr+height(root.right);
		if(heightl>=heightr){
			height= heightl+1;

		}
		else{
			if(heightl<heightr){
				height= heightr+1;
			}
		}
		return height;
	}
	public static BinaryTreeNode<Integer> find(BinaryTreeNode<Integer> root,int find){
		if(root==null){
			return null;
		}
		if(root.data==find){
			return root;
		}
		BinaryTreeNode<Integer> LeftAns=find(root.left,find);
		if(LeftAns!=null){
			return LeftAns;
		}
		else{
			BinaryTreeNode<Integer> RightAns=find(root.right,find);
			if(RightAns!=null){
				return RightAns;
			}

		}
		return null;

	}
	public static BinaryTreeNode<Integer> BSTfind(BinaryTreeNode<Integer> root,int find){
		if(root==null){
			return null;
		}
		if(root.data==find){
			return root;
		}
		if(find>root.data){
			BinaryTreeNode<Integer> RightAns=BSTfind(root.right,find);
			if(RightAns!=null){
				return RightAns;
			}
		}else
		{
			if(find<root.data){
				BinaryTreeNode<Integer> LeftAns=BSTfind(root.left,find);
				if(LeftAns!=null){
					return LeftAns;
				}
			}
		}



		return null;
	}
	public static void BSTRangefind(BinaryTreeNode<Integer> root,int a,int b){
		if(root==null){
			return ;
		}
		if(b<root.data){
			BSTRangefind(root.left,a,b);
		}
		else if(a>root.data){
			BSTRangefind(root.right,a,b);
		}
		else{
			System.out.println(root.data);
			BSTRangefind(root.left,a,b);
			BSTRangefind(root.right,a,b);
		}

	}
	public static boolean BSTcheck(BinaryTreeNode<Integer> root){
		if(root==null){
			return true;
		}
		int leftMaximum=maximum(root.left);
		int rightMinimum=minimum(root.right);
		if(root.data<leftMaximum||root.data>rightMinimum){
			return false;
		}
		return BSTcheck(root.left)&&BSTcheck(root.right);



	}
	public static int maximum(BinaryTreeNode<Integer> root){
		if(root==null){
			return Integer.MIN_VALUE;
		}
		return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));
	}
	public static int minimum(BinaryTreeNode<Integer> root){
		if(root==null){
			return Integer.MAX_VALUE;
		}
		return Math.min(root.data,Math.min(minimum(root.left),minimum(root.right)));
	}
	public static int depthOfNode(BinaryTreeNode<Integer> root,int Element,int depth){

		if(root==null){
			return -1;
		}
		if(root.data==Element){
			return depth;
		}else{
			int data=depthOfNode(root.left,Element,depth+1);
			if(data==-1){
				depthOfNode(root.right,Element,depth+1);
			}
			else{
				return data;
			}
		}
		return depth;

	}
	public static boolean checkSibling(BinaryTreeNode<Integer> root,int r1,int r2){
		if(root==null){
			return false;
		}
		if((root.left!=null&&root.right!=null)){
			if(root.left.data==r1&&root.right.data==r2){
				return true;
			}
			else if(root.left.data==r2&&root.right.data==r1)
				return true;

		}

		boolean check1=checkSibling(root.left,r1,r2);
		if(!check1){
			boolean check2=checkSibling(root.right,r1,r2);
			return check2;
		}else{
			return check1;
		}

		//		return check1||check2;

	}
	public static Boolean checkCousin(BinaryTreeNode<Integer> root,int r1,int r2){
		int depth1=depthOfNode(root,r1,0);
		int depth2=depthOfNode(root,r2,0);
		if(depth1==depth2&&!checkSibling(root,r1,r2)){
			return true;
		}else{
			return false;
		}

	}
	public static void levelOrderTraversal(BinaryTreeNode<Integer> root) throws Exception{
		Queue<BinaryTreeNode<Integer>> pendingNodes =  new Queue<>();

		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()){
			String s="";
			int x=pendingNodes.retSize();

			for(int i=0;i<x;i++){
				BinaryTreeNode<Integer> t=pendingNodes.dequeue();
				s=s+t.data+" ";


				if(t.left!=null){
					pendingNodes.enqueue(t.left);
				}
				if(t.right!=null){
					pendingNodes.enqueue(t.right);
				}
			}

			System.out.println(s);


		}
	}
public static BinaryTreeNode<Integer> delete(BinaryTreeNode<Integer> root){
	if(root==null){
		return null;
	}
	if(root.left==null&&root.right==null){
		return null;
	}
	root.left=delete(root.left);
	root.right=delete(root.right);
	return root;
}
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
public static void Duplicateleft(BinaryTreeNode<Integer> root){
	if(root==null){
		return;
	}else{
	BinaryTreeNode<Integer> temp=new BinaryTreeNode<Integer>(root.data);
	
	BinaryTreeNode<Integer> temp2=root.left;
	root.left=temp;
	temp.left=temp2;
	Duplicateleft(root.left.left);
	Duplicateleft(root.right);

	
	}
}
public static int BSTsize(BinaryTreeNode<Integer> root){
	if(root==null){
		return 0;
	}
	return BSTsize(root.left)+BSTsize(root.right)+1;
}
public static boolean BSTIsEmpty(BinaryTreeNode<Integer> root){
	return root==null;
}

	




	//1 2 3 -1 5 6 7 -1 -1 -1 -1 -1 -1
	//	1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1

	//10 6 -1  -1 12 -1 -1 
	public static void main(String[] args)throws Exception {
		BinaryTreeNode<Integer> root=input();
//		BinaryTreeNode<Integer> root2=input();
		output(root);
//		output(root2);
		//		System.out.println(height(root));
		//		root=mirror(root);
		//		output(root);
		//		System.out.println(BSTfind(root,10).data);
		//		BSTRangefind(root, 12, 70);
		//			System.out.println(depthOfNode(root,5,0));
//		System.out.println(checkSibling(root,6,7));
//		System.out.println(checkCousin(root,5,6));
//		levelOrderTraversal(root);
//		root=delete(root);
//		Duplicateleft(root);
		System.out.println("Size is:"+BSTsize(root));
		System.out.println(BSTIsEmpty(root));
//		output(root);
//		System.out.println(StructurallyIdentical(root, root2));
		//		System.out.println(BSTcheck(root));


	}
}
