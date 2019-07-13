

package oops;


import java.util.Scanner;

public class Studentuse {


	public static <T extends CompareInterface<T>>void bubbleSort(T input[]){
		for(int i=0;i<input.length-1;i++){
			for(int j=0;j<input.length-i-1;j++){
				if(input[j].compareTo(input[j+1])==-1){

					T temp=input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
				}

			}
		}
	}



	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		Student arr[]=new Student[10];
		for(int i=0;i<10;i++){
			arr[i]= new Student(i);
			arr[i].marks=s.nextInt();

		}
		bubbleSort(arr);
		for(int k=0;k<10;k++){
			System.out.println(arr[k].marks);
		}




	}


}
