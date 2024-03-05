/*
time
1  10  11  20  21  
2  9  12  19  22
3  8  13  18  23
4  7  14  17  24
5  6  15  16  25
*/

import javax.swing.JOptionPane;
//Without using extra space 

public class Q4 {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Enter the number ");
        int n = Integer.parseInt(num);

        int decri = (n * 2) - 1;
        int incri = 1;

        for (int i = 1; i <= n; i++) {
            int count = i;

            for (int j = 1; j <= n; j++) {
                if (j % 2 != 0) {
                    System.out.print(count + "  ");
                    count = count + decri;
                } else {

                    System.out.print(count + "  ");
                    count = count + incri;
                }

            }
            System.out.println();
            decri = decri - 2;
            incri = incri + 2;
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////

// Using extra space

// public class Q4 {
// public static void main(String[] args) {

// String num = JOptionPane.showInputDialog("Enter the number ");
// int n = Integer.parseInt(num);

// int[][] matrix = new int[n][n];
// int counter = 1;

// // Designing the matrix
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++) {
// matrix[i][j] = counter++;
// }
// }

// // Print the matrix in the specified pattern
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++) {
// if (j % 2 == 0) {
// System.out.print(matrix[j][i] + " ");
// } else {
// System.out.print(matrix[j][n - 1 - i] + " ");
// }
// }
// System.out.println();
// }
// }
// }