//1) write a program to design student datatype containing rollno name percentage and add five element in linked list
import java.util.*;
class student{
	int rollno;
	String name;
	double percentage;
	
	
	student(int r,String n,double p){
		percentage=p;
		name=n;
		rollno=r;
	}
	
	
	
	public void showData(){
		System.out.println("Roll NO is :"+rollno);
		System.out.println("Name is :"+name);
		System.out.println("Percentage is :"+percentage);
	}
}

class test{
	
	public static void main(String args[]){
		
		student s1=new student(1,"owskar",90.3);
		
		
	LinkedList<student>l= new LinkedList<student>();
	l.add(s1);
	
	
	
	
		
		// l.showData();
		
		
		
		
	}
}