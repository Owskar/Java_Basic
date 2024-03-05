import javax.swing.JOptionPane;
// 3) write a program a positive number and print all even number from 2 to that number.

class Q3 {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Enter the number ");
        int n = Integer.parseInt(num);

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
    }
}