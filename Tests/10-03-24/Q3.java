// 8) implement the five methods of string builder 

import javax.swing.*;
class Q3{
	public static void main(String args[]){
		StringBuilder s= new StringBuilder("i am owskar");
		System.out.println("Original string :"+s);
		
		s.replace(0,4,"he is");
		
		
		
		System.out.println("replace : "+s);
		
		s.delete(6,10);
		
		System.out.println("delete : "+s);
		
		
		s.append(" Manoj");
		System.out.println("Append :"+s);
		
	
		s.insert(11," is programming");
		System.out.println("insert :"+s);

		
		s.reverse();
		System.out.println("reverse"+s);
		

		
		System.out.println("capacity :"+s.capacity());
		
		
		
		
		
		
	}
}