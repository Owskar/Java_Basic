import javax.swing.*;
class Shop{
	public static void main(String []args){

		String Pname=JOptionPane.showInputDialog("Enter Product name :");
		
		String price=JOptionPane.showInputDialog("Enter Product price :");
		int p= Integer.parseInt(price);
		
		String qty=JOptionPane.showInputDialog("Enter the quantity ;");
		int q= Integer.parseInt(qty);
		
		int bill=p*q;
		
		System.out.println("product name is "+Pname+" price is "+p+" quantity is " +q);
		System.out.println("The bill is :"+bill);
	}
	

}