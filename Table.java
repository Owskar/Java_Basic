//write a program to read a number and print the table of that number 

import javax.swing.*;
class Loops3{
	public static void main(String []args){
		
		int i=1;
		String num=JOptionPane.showInputDialog("Enter the number");
		int n=Integer.parseInt(num);
	while(i<=10){
		System.out.println(n+" X "+i+" = "+(i*n));
		i++;
	}
	}
}