import javax.swing.JOptionPane;

/*
 

*        * 
 *      *  
  *    *   
   *  *    
    *     
   *  *    
  *    *   
 *      *  
*        * 


 */
public class Q8 {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Enter the number ");
        int n = Integer.parseInt(num);

        // int k = n * 2 - 1;
        // for (int i = 1; i <= k; i++) {
        // for (int j = 1; j <= k; j++) {
        // if (j == i || j == k - i + 1)
        // System.out.print("*");
        // System.out.print(" ");
        // }
        // System.out.println();
        // }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}