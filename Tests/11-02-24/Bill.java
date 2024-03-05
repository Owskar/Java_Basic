//8) write a prg for dmart billing system using do while loop
import javax.swing.*;

class Bill{
	
    public static void main(String args[]){
		
		int bill=0;
		int total;
		
	do{
		String product=JOptionPane.showInputDialog("Enter the product name ");
		String prize=JOptionPane.showInputDialog("Enter the product Prize ");
		int p=Integer.parseInt(prize);
		String qty=JOptionPane.showInputDialog("Enter the product quantity");
		int q=Integer.parseInt(qty);
		
		System.out.println("Your product is "+product);
		System.out.println("Your product prize is "+p);
		System.out.println("Your product quantity is "+q);
		total=p*q;
		bill=bill+total;
		
	}while(total!=0);
		
	System.out.println("your total bill is "+bill);
	
	}

}