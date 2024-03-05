
//7) write a program to read a string and check string is palindrome or not
// without using toChar method
import javax.swing.*;

class Q9 {
	public static void main(String args[]) {
		String s1 = JOptionPane.showInputDialog("Enter the string :");
		String s2 = "";

		int l = s1.length();
		for (int x = l - 1; x >= 0; x--) {

			s2 = s2.concat(s1.substring(x, x + 1));

		}

		System.out.println("s1 is " + s1);
		System.out.println("s2 is " + s2);

		if (s1.equals(s2)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not  palindrome");

		}

	}
}