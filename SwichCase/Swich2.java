// write a program to design a calcoulater using switch case

import javax.swing.*;
class Swich2{
	
	public static void main(String []args){
		String A=JOptionPane.showInputDialog("Enter the a for addition \n s for substraction \n d for division \n m for multiplication");
		String num1=JOptionPane.showInputDialog("Enter the first number ");
		int n1=Integer.parseInt(num1);
		String num2=JOptionPane.showInputDialog("Enter the second number ");
		int n2=Integer.parseInt(num2);
		
		switch(A){
			
			case "a": System.out.println("Your addition is "+(n1+n2));
						break;
			case "s": System.out.println("Your Subtraction is "+(n1-n2));
						break;
			case "d": System.out.println("Your division is "+(n1/n2));
						break;
			case "m": System.out.println("Your multiplication is "+(n1*n2));
						break;
			default : System.out.println("invalid choice");
		}
	}
}