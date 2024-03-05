/*
    
5) 1 2 3 4 5 4 3 2 1
   1 2 3 4 5 4 3 2 1
   1 2 3 4 5 4 3 2 1
   1 2 3 4 5 4 3 2 1
   1 2 3 4 5 4 3 2 1
   
 */
class Q5 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            for (int j = 4; j > 0; j--) {
                System.out.print(j + " ");
            }

            System.err.println();
        }
    }
}