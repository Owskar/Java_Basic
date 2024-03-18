//10) write a program to sort string in alpabetical order (user input string )

import javax.swing.*;

import java.util.*;
class Q10{
	public static void main(String args[]){
	
		String s=JOptionPane.showInputDialog("Enter the string :");
		System.out.println("Original String "+s);
		char ch[]=s.toCharArray();
		
		Arrays.sort(ch);
		System.out.println("Sorted String ");
		
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]);
		}
		
	
	}
}