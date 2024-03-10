// 10) wire a program to read a string and replace the vovels with # and print the string
import javax.swing.*;
class Q2{
	public static void main(String args[]){
		String s=JOptionPane.showInputDialog("Enter the string ");
		
		System.out.println("string is :"+s);
		
		
		s=s.replace('a','#');
		s=s.replace('e','#');
		s=s.replace('i','#');
		s=s.replace('o','#');
		s=s.replace('u','#');
		
		
		System.out.println("Updated string is :"+s);
	}
}