
import javax.swing.*;
class Heart {
    public static void main(String[] args) {
        int a, b ;
		String s = JOptionPane.showInputDialog("Enter the size \nin between \n 10 to 35 ");
		int size=Integer.parseInt(s);
        
        for (a = size / 2; a <= size; a = a + 2) {
            //blank space : Part 1
			
            for (b = 1; b < size - a; b = b + 2){
                System.out.print(" ");
			}
			
            // first side  : Part 2
            for (b = 1; b <= a; b++)
                System.out.print("*");
			

            // Middle blank triangle : part 3
            for (b = 1; b <= size - a; b++)
                System.out.print(" ");



            // second side : part 4
			
            for (b = 1; b <= a - 1; b++)
                System.out.print("*");

            System.out.println();
        }





        /* The inverted triangle (base) */

        for (a = size; a >= 0; a--) {
            // Space before inverted triangle : part 5
            for (b = a; b < size; b++)
                System.out.print(" ");

            //inverted triangle : part 6
            for (b = 1; b <= ((a * 2)-1); b++)
                System.out.print("*");

            System.out.println();
        }

    }

}
