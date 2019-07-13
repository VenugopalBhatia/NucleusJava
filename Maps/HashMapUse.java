package Maps;

import java.util.HashMap;
import java.util.Map;



public class HashMapUse {
	public static void Intersection(int[] input1,int[] input2){
		if(input1.length>input2.length){
			int[] temp=input1;
			input1=input2;
			input2=temp;
		}
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<input1.length;i++){
			int key=input1[i];
			if(!map.containsKey(key)){
				map.put(key,1);
			}else{
				int oldValue=map.get(key);
				map.put(key,oldValue+1);
			}



		}
		for(int i=0;i<input2.length;i++){
			if(map.containsKey(input2[i])&&map.get(input2[i])>0){
				System.out.println(input2[i]);
				int oldValue=map.get(input2[i]);
				map.put(input2[i],oldValue-1);
			}
		}

	}
	public static int[] RemoveDuplicate(int[] input){
		HashMap<Integer,Boolean> map=new HashMap<>();
		for(int i=0;i<input.length;i++){
			int key=input[i];
			if(!map.containsKey(key)){

				map.put(key, true);

			}
		}
		int[] arr=new int[map.size()];
		int count=0;
		for(int i=0;i<input.length;i++){
			int key=input[i];

			if(map.get(key)){
				arr[count]=key;
				count++;
				map.put(key,false);
			}
		}
		return input;


	}
	public static void PairSumZero(int[]input){
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<input.length;i++){
			int key=input[i];
			if(!map.containsKey(key)){

				map.put(key, 1);

			}else{if(key<0){
				int oldValue=map.get(input[i]);
				map.put(input[i],oldValue+1);
			}
			}
		}
		for(int i=0;i<input.length;i++){

			int key=input[i];
			if(key>0){
				if(map.containsKey(0-key)){
					for(int j=0;j<map.get(0-key);j++)
					{
						System.out.println(key+","+(0-key));
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		//	int[] input1={10,2,10,2,11,6,8,7,1};
		//	int[] input2=RemoveDuplicate(input1);
		int[] input3={2,-2,2,-2,3,-3,-3,-2};
//		PairSumZero(input3);
		String a = "abc";
		String str = "abc";
		System.out.println(a.hashCode());
		System.out.println(str.hashCode());
		BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>(10);
		System.out.println(node.hashCode());
		
		//	for (int i = 0; i < input2.length; i++) {
		//		System.out.println(input2[i]);
		//	}
		//	

	}
}
