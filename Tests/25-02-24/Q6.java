//8) write a program to read a string and calculate the length of string and total number of words in a string
import javax.swing.*;
class Q6{

public static void main(String args[]){
	
	String s=JOptionPane.showInputDialog("Enter the string");
	int l=s.length();
	System.out.println("length is :"+l);
	

	
	
	
	System.out.println(s);
	int c=0;
	
	String w[]=s.split("\\s");
	for(String s2:w){
		c++;
	}
	System.out.println("total words :"+c);
	
	
}
}
