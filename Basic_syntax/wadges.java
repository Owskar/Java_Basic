/*

write a program to read lady name wadges w days calculate pagar 
if wdays > 10 then give 10% bonus to that lady
display lady name wadges wdays pagar before bonus after bonus and bonus amount


*/

import javax.swing.*;
class wadges{
	public static void main(String []args){
	
		String Lname=JOptionPane.showInputDialog("Enter the Lady Name ");
		String wadges=JOptionPane.showInputDialog("Enter the Wadges");
		int w=Integer.parseInt(wadges);
		
		String Wdays= JOptionPane.showInputDialog("Enter the Working days");
		int Wd=Integer.parseInt(Wdays);
		
		double payment=w*Wd;
		
		System.out.println();
		System.out.println("The lady name is "+Lname+" and her wadges are "+w+" and working days are  "+Wd+" and ");
	
		if(Wd>10){
			double Bpagar=payment*1.10;
			double Bamount=payment*0.10;
			System.out.println("her payment is "+payment+" and she got 10% bonus for working more than 10 days i.e. "+Bamount+" there fore her total payment is "+Bpagar);
			System.out.println();
		}else{
			
			System.out.println("your payment is "+payment);
			System.out.println();
		}
		
	}
}