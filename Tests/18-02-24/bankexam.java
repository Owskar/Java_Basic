//10)  wrte a program to read name and age and check candidate is eligible for bank exam or not age must be 22 to 30.

import javax.swing.*;

class bank {
	public static void main(String args[]) {
		String name = JOptionPane.showInputDialog("enter the name");
		String age = JOptionPane.showInputDialog("enter the age");
		int a = Integer.parseInt(age);

		if (a > 25 && a < 30) {
			System.out.println(name + "eligible for bank exam");
		} else {
			System.out.println(name + "not eligible");
		}
	}
}