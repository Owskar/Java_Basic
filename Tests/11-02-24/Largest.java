
//4) write a program to read three number and print largest

import javax.swing.*;

class Largest{
	public static void main(String []args){
		String num1=JOptionPane.showInputDialog("Enter the number1");
		int n1=Integer.parseInt(num1);
		
		String num2=JOptionPane.showInputDialog("Enter the number2");
		int n2=Integer.parseInt(num2);
		
		String num3=JOptionPane.showInputDialog("Enter the number3");
		int n3=Integer.parseInt(num3);
		System.out.println("Number 1 is "+n1);
		System.out.println("Number 2 is "+n2);
		System.out.println("Number 3 is "+n3);
		
		if(n1>n2 && n1>n3){
			System.out.println(n1+" is largest");
		}
		else if(n2>n1 && n2>n3){
			
			System.out.println(n2+" is largest");
		}
		else{
			System.out.println(n3+" is largest");
		}
	}
}