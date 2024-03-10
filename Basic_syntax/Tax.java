/*
Write a program to read employee name wadges and wDays calculate payment if paymet is 
grater than 25000 then 18% tax deducted from the payment 
disply employee name ,wadges ,wDays
payment  befor tax ,after tax and tax amout

*/

import javax.swing.*;
class Tax{
	public static void main(String []args){
	
		String Ename=JOptionPane.showInputDialog("Enter the Employee Name ");
		String wadges=JOptionPane.showInputDialog("Enter the Wadges");
		int w=Integer.parseInt(wadges);
		
		String Wdays= JOptionPane.showInputDialog("Enter the Working days");
		int Wd=Integer.parseInt(Wdays);
		
		double payment=w*Wd;
		
		System.out.println();
		System.out.println("The Employee name is "+Ename+" and the wadges are "+w+" and working days are  "+Wd+" and");
		
		if(payment>25000){
			
			System.out.println("You got 18% didcuction on your payment and your Payment amount is "+ payment*0.82+"and your tax amount is "+payment*0.18);
			System.out.println();
			
		}
		else{
			
			System.out.println("Your payment is "+ payment);
			System.out.println();
		}
	}
}