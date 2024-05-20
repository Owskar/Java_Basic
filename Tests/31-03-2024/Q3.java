//3) write a progrm for generic collectiton vector and implement five method of vector

import java.util.*;
class Q3{
	public static void main(String args[]){
		Vector<String>l= new Vector<String>();
		
		l.add("Owskar");
		l.add("Harshu");
		l.add("Sonu");
		l.add("shruti");
		l.add("Sneha");
		
		System.out.println("Rebooters : "+l);
	Vector<String>A=new Vector<String>();
	A.add("Kiran");
	A.add("Omkar");
	A.add("Guru");
	//addAll
	l.addAll(A);
	System.out.println("combination of both "+l);
	
	//remove
	l.remove("Sonu");
	System.out.println("Sounu remove :"+l);
	
	//clear
	l.clear();
	System.out.println("list is clear :"+l);
	
	//isEmpty
	System.out.println("isEmpty :"+l.isEmpty());
	
	
	//size
	System.out.println("Size :"+A.size());
	
	}
}