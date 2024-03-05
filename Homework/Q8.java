/*
 *    
8) 
	1 2 3 4 5
	1 2 3 4 5
	1 2 3 4 5
	9 8 7 6 5
	9 8 7 6 5
	9 8 7 6 5
	
 */

public class Q8 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                for (int j = 1; j < 6; j++) {
                    System.out.print(j + " ");
                }
            } else {
                for (int j = 9; j >= 5; j--) {
                    System.out.print(j + " ");

                }
            }
            System.out.println();
        }
    }
}