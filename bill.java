// Write a program to read product name price and quantity calculate the bill if bill is 
// is grater than 5000 then give 25% discount on bill

import javax.swing.*;
class bill{
	public static void main(String []args){
	
		String Pname=JOptionPane.showInputDialog("Enter the Product Name ");
		String price=JOptionPane.showInputDialog("Enter the price :");
		int p=Integer.parseInt(price);
		
		String Quantity= JOptionPane.showInputDialog("Enter the quantity");
		int q=Integer.parseInt(Quantity);
		
		int bill=p*q;
		
		System.out.println();
		System.out.println("You purchased "+Pname+" and quantity is "+q+" at price of "+p+" and");
		
		if(bill>5000){
			
			System.out.println("You got 25% discount on your bill and your bill amount is "+ bill*0.75);
			System.out.println();
			
		}
		else{
			
			System.out.println("Your bill is "+ bill);
			System.out.println();
		}
		
		
	}


} 