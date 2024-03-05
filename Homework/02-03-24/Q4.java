import javax.swing.JOptionPane;

/*
12345
 1234
  123
   12
    1
     
*/
public class Q4 {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Enter the number ");
        int n = Integer.parseInt(num);
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(j);

            }
            System.out.println();
        }
    }
}