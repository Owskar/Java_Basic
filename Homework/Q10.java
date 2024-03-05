/*
 * 	
10)

	A B C D E
	A B C D E
	A B C D E
	A B C D E
	A B C D E
	
 */

public class Q10 {
    public static void main(String[] args) {
        for (char i = 1; i <= 5; i++) {
            for (char j = 'A'; j < 'F'; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}