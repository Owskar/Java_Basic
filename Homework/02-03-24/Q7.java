import javax.swing.JOptionPane;

public class Q7 {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Enter the number ");
        int n = Integer.parseInt(num);

        for (int i = n; i >= 0; i--) {
            // Space before inverted triangle
            for (int j = i; j < n; j++) {

                System.out.print(" ");
            }

            // inverted triangle :part 1
            for (int j = 1; j <= n; j++) {
                if (j == i) {

                    System.out.print(i);
                }

            }
            // space between triangle
            for (int k = 1; k < i * 2 - 1; k++) {
                System.out.print(" ");
            }

            // inverted triangle :part 2
            for (int j = 1; j <= n; j++) {
                if (j == i && j != 1) {

                    System.out.print(i);
                }

            }

            System.out.println();
        }
    }
}