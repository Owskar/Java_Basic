import javax.swing.JOptionPane;

// 1) write a program to read a positive number and print all number form 1 to that number.
class Q1 {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Enter the number ");
        int n = Integer.parseInt(num);

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}