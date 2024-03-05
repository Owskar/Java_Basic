//9) write a program to read two numbers and swap that two number without using third 
import javax.swing.*;
class Q7{
public static void main(String args[]){

	String num1=JOptionPane.showInputDialog("Enter the number 1");
	int n1=Integer.parseInt(num1);
	
	String num2=JOptionPane.showInputDialog("Enter the number 2");
	int n2=Integer.parseInt(num2);
	System.out.println("num1 :"+n1);
	System.out.println("num2 :"+n2);
	
	n1=n1+n2;
	n2=n1-n2;
	n1=n1-n2;
	System.out.println("After swapping ");
	
	System.out.println("num1 :"+n1);
	System.out.println("num2 :"+n2);
	
	
}
}