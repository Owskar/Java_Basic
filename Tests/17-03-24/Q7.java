/*
7) write a progrma to implemt following methods in arraylist 
	add
	addall
	remove
	remove all
	isEmpty
	clear
	size
   
*/
import java.util.*;
class Q7{
	public static void main(String args[]){
ArrayList<String>A=new ArrayList<String>();
	A.add("owskar");
	A.add("manoj");
	A.add("shubham");
	A.add("saniya");
	A.add("harsha");
	
	System.out.println("Elements in arraylist 1 : "+A);
	
	ArrayList<String> A2=new ArrayList<String>();
	A2.add("piyusha");
	A2.add("shradda");
	A2.add("Vishakha");
	A2.add("shruti");
	
	System.out.println("Elements in arraylist 2 "+A2);
	
	//addAll
	A.addAll(A2);
	System.out.println("combination of both "+A);
	
	//remove
	A.remove("owskar");
	System.out.println(" remove Owskar :"+A);
	
	//removeAll
	A.removeAll(A2);
	System.out.println("remove A2  from A:"+A2);
	
	//clear
	A.clear();
	System.out.println("list is clear"+A);
	
	//isEmpty
	System.out.println("isEmpty :"+A.isEmpty());
	
	//size
	System.out.println("Size :"+A2.size());
	

	
	//add()
	A2.add(1,"snehankeet");
	System.out.println("Get add method "+A2);
	
	
	}
}