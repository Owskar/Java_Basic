// Tree set


import java.util.*;
class C8{
	public static void main(String args[]){
		TreeSet<Integer>H1=new TreeSet<Integer>();
		
		H1.add(11);
		H1.add(5);
		H1.add(15);
		H1.add(8);
		H1.add(20);
		
		
		System.out.println("List is "+H1);
		
		System.out.println("Ceiling of 5 is "+H1.ceiling(5));
		System.out.println("Ceiling of 18 is "+H1.ceiling(18));
		System.out.println("Floor of 2 is "+H1.ceiling(2));
		System.out.println("Floor of 13 is "+H1.ceiling(13));
		
	}
}