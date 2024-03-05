import javax.swing.JOptionPane;

public class Q6 {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Enter the number ");
        int n = Integer.parseInt(num);

        for (int i = n; i >= 0; i--) {
            // Space before inverted triangle
            for (int j = i; j < n; j++)
                System.out.print(" ");

            // inverted triangle
            for (int j = 1; j <= ((i * 2) - 1); j++)
                System.out.print("*");

            System.out.println();
        }
    }
}