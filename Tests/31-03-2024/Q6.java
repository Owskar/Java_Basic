//6) write a program to implement 7 method of treeset

import java.util.*;
class Q6{
	public static void main(String args[]){
		TreeSet<Integer>H1=new TreeSet<Integer>();
		//add
		H1.add(100);
		H1.add(56);
		H1.add(154);
		H1.add(80);
		H1.add(202);
		
		
		System.out.println("List is "+H1);
		
		//remove
		H1.remove(100);
		System.out.println("100 remove :"+H1);
		
		//ceil
		System.out.println("Ceiling of 57 is "+H1.ceiling(57));
		
		//floor,
		System.out.println("floor of 100 is "+H1.floor(100));
	
		//size
		System.out.println("Size :"+H1.size());
		
		
		//clear
		H1.clear();
		System.out.println("H1 is :"+H1);
		
		//isEmpty
	System.out.println("isEmpty :"+H1.isEmpty());
	
	
		
		
	}
}