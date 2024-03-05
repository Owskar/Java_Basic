//write a program for factorial of given number 

import javax.swing.JOptionPane;

class Q1 {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Enter the number ");
        int n = Integer.parseInt(num);
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        System.out.println("Factorial of number is " + fac);
    }
}