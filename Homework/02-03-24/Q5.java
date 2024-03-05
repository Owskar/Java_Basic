import javax.swing.JOptionPane;
/*
           1 
         3 3 3 
       5 5 5 5 5 
     7 7 7 7 7 7 7 
   9 9 9 9 9 9 9 9 9 
 */

public class Q5 {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Enter the number ");
        int n = Integer.parseInt(num);
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print((2 * i - 1) + " ");
            }

            System.out.println();
        }
    }
}