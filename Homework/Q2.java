import javax.swing.JOptionPane;
// 2) write a program to read a name and positive number print that name up to that number. 

class Q2 {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter the Name ");
        String num = JOptionPane.showInputDialog("Enter the number ");
        int n = Integer.parseInt(num);

        for (int i = 1; i <= n; i++) {
            System.out.println(name);
        }
    }
}