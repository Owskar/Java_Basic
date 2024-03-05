//3) write a program Product name prize quantity and calculate bill amount and final bill
import javax.swing.*;

class Q3{
	public static void main(String args[]){
		
		int bill,totalBill=0;
		do{
			String Pname=JOptionPane.showInputDialog("Enter the produt name");
			
			String prize=JOptionPane.showInputDialog("Enter the produt prize");
			int p=Integer.parseInt(prize);
			
			String qty=JOptionPane.showInputDialog("Enter the produt quantity");
			int q=Integer.parseInt(qty);
			
			
			System.out.println("product :"+Pname);
			System.out.println("prize :"+p);
			System.out.println("quantity :"+q);
			
			
			bill=p*q;
			System.out.println("total :"+bill);
			totalBill=totalBill+bill;
			
			
			
		}while(bill!=0);
		
		System.out.println("total bill is :"+totalBill);
		
	}
	
	
}