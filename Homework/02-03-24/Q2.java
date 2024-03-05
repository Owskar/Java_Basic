import javax.swing.JOptionPane;

class Q2 {

    public static int gcd(int a, int b) {

        if (b == 0) {

            return a;
        }

        return gcd(b, b % a);

    }

    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Enter the number1 ");
        int n1 = Integer.parseInt(num1);

        String num2 = JOptionPane.showInputDialog("Enter the number2 ");
        int n2 = Integer.parseInt(num2);
        int GCD = gcd(n1, n2);
        System.out.println("The GCD is " + GCD);

        int LCM = (n1 * n2) / GCD;
        System.out.println("The LCM is " + LCM);

    }
}