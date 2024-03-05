/*
Write a program to read a number and check number is positive negtive or zero


*/
import javax.swing.*;
class number{
	public static void main(String []args){
	
		
		String num=JOptionPane.showInputDialog("Enter the number");
		int n=Integer.parseInt(num);
		
		if(n>0){
			System.out.println(n+" is positive");
			
		}
		else if(n<0){
			System.out.println(n+ " is negtive");
		}
		else{
			System.out.println("Number is zero");
		}
	}
}