
/*
 *    
6) 
   1 2 3 4 5
   5 4 3 2 1 
   1 2 3 4 5
   5 4 3 2 1
   1 2 3 4 5
   5 4 3 2 1
   s
 */

public class Q6 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j < 6; j++) {
                    System.out.print(j + " ");
                }
            } else {
                for (int j = 5; j > 0; j--) {
                    System.out.print(j + " ");

                }
            }
            System.out.println();
        }
    }
}