import javax.swing.JOptionPane;

/*

*******
*     *
*     *
*     *
*     *
*     *
*******

*/
public class QE {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Enter the number ");
        int n = Integer.parseInt(num);

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == n || j == n || i == 0 || j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}