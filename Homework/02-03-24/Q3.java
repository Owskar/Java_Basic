/*
        *
       **
      ***
     ****
    *****

*/

import javax.swing.JOptionPane;

public class Q3 {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Enter the number ");
        int n = Integer.parseInt(num);
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}