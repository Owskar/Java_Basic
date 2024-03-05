/*
 4) 9 8 7 6 5
   9 8 7 6 5
   9 8 7 6 5
   9 8 7 6 5
   9 8 7 6 5

 */

class Q4 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 9; j >= 5; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}