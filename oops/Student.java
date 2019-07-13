
package oops;

import java.util.Scanner;

public  class Student implements CompareInterface<Student> {
	public String name;
	public final int rollNo;
	String address;
	String course;
	
	static  int numStudents;
	public int marks;


	Student(int i){
		
		this.rollNo=i;
		
	}
	//	
	public Student(String name){

		this.name = name;
		numStudents++;
		rollNo = numStudents;
	}
	//	
	public String getName(){
		System.out.println(name);
		return this.name;
	}

	public   int getRollNo(){
		return this.rollNo;
	}
	void setRollNo(int num){
		if(num < 0){
			return;
		}
		//			 
	}

	static  public int getNumStudents(){

		return numStudents;
	}
	public int compareTo(Student second){
		if(this.marks>second.marks){
			return -1;
		}
		else{
			if(this.marks<second.marks){
				return 1;
			}
		}
		return 0;
	}
	
	
	

	}
	




