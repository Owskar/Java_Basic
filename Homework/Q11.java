/*
 * 	
11)

	9 7 5 3 1
	9 7 5 3 1
	9 7 5 3 1
	9 7 5 3 1
	9 7 5 3 1
	
 */

public class Q11 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 9; j > 0; j = j - 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}