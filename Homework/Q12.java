/*
 * 	
12)

	a b c d e
	a b c d e
	a b c d e
	a b c d e
	a b c d e
	
 */

public class Q12 {
    public static void main(String[] args) {
        for (char i = 1; i <= 5; i++) {
            for (char j = 'a'; j < 'f'; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}