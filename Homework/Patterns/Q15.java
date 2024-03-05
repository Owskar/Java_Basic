/*
A 
B C
C D E
D E F G
E F G H I
*/

public class Q15 {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {
            char a = i;
            for (char j = 'A'; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}