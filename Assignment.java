/*
write a program to read employee name wedges and working days calclate payment of employee display employee name, wedges
wdays , payment


*/
import javax.swing.*;
class Assignment{
	public static void main(String []args){

		String Ename=JOptionPane.showInputDialog("Enter the Employee name :");
		
		String Wadges=JOptionPane.showInputDialog("Enter the wadges");
		int w=Integer.parseInt(Wadges);
		
		String Wdays=JOptionPane.showInputDialog("Enter the working days ");
		int d=Integer.parseInt(Wdays);
		
		int p=w*d;
		
		System.out.println("The employee name is "+ Ename + " the wadges are "+w+ " working days are " +d+ " payment is " + p);
	}
	

}