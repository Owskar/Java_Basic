/*
write a program to read product name prize quantity calculate bill
if bill is grater than 10000 then give the 30% discount on bill
if bill is gratar than 5000 then give the discount 20%
if bill is grater than 2000 then give the 5% discount

*/

import javax.swing.*;

class Billdis {
	public static void main(String[] arges) {

		String product = JOptionPane.showInputDialog("Enter the product name");
		String prize = JOptionPane.showInputDialog("Enter the prize");
		int p = Integer.parseInt(prize);

		String qty = JOptionPane.showInputDialog("Enter the Quantity");
		int q = Integer.parseInt(qty);

		int bill = p * q;
		System.out.println();
		System.err.println("You Purchased the " + product + " at prize " + prize + " and ");
		if (bill > 10000) {
			System.out.println("You got 30% discount on your bill and your payable amount is " + bill * 0.70);
			System.out.println();
		} else if (bill > 5000) {
			System.out.println("You got 20% discount on your bill and your payable amount is " + bill * 0.80);
			System.out.println();
		} else if (bill > 2000) {
			System.out.println("You got 5% discount on your bill and your payable amount is " + bill * 0.95);
			System.out.println();
		} else {
			System.out.println("Your bill is " + bill);
			System.out.println();
		}

	}
}